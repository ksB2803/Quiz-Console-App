# file: streamlit_menu_app.py

import streamlit as st

# Dummy data simulating restaurant menu
menu_items = [
    {"name": "Paneer Tikka", "category": "Starters", "description": "Chunks of paneer marinated in spices and grilled.", "price": 180},
    {"name": "Chicken Wings", "category": "Starters", "description": "Spicy grilled wings with BBQ sauce.", "price": 200},
    {"name": "Butter Chicken", "category": "Main Course", "description": "Creamy tomato-based chicken curry.", "price": 280},
    {"name": "Veg Biryani", "category": "Main Course", "description": "Fragrant basmati rice with mixed vegetables.", "price": 220},
    {"name": "Gulab Jamun", "category": "Desserts", "description": "Deep fried khoya balls soaked in sugar syrup.", "price": 90},
    {"name": "Ice Cream", "category": "Desserts", "description": "Choice of vanilla, chocolate, and strawberry.", "price": 80},
]

st.set_page_config(page_title="Interactive Restaurant Menu", layout="wide")

st.title("🍽️ Restaurant Menu")
categories = sorted(set(item["category"] for item in menu_items))

selected_category = st.sidebar.selectbox("Select Category", categories)

filtered_items = [item for item in menu_items if item["category"] == selected_category]

for item in filtered_items:
    with st.container():
        st.subheader(f'{item["name"]} - ₹{item["price"]}')
        show_more = st.button(f"View Details: {item['name']}", key=item["name"])
        if show_more:
            st.markdown(f'**Description**: {item["description"]}')
            st.markdown("---")
