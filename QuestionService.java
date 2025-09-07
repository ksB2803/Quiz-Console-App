import java.util.Scanner;

public class QuestionService {
    Scanner sc = new Scanner(System.in);
    Question[] question = new Question[5];
    String[] Selection = new String[5];
    public QuestionService() {
        question[0] = new Question(1,"Which player scored the infamous \"Hand of God\" goal, and which country was it against in the 1986 World Cup? ⚽", "A) Lionel Messi against Germany", "B) Diego Maradona against England", "C) Thierry Henry against Republic of Ireland", "D) Pelé against Italy", "Diego Maradona against England");
        question[1] = new Question(2,"Which club has won the most UEFA Champions League titles in history? 🏆", "A) FC Barcelona", "B) AC Milan", "C) Liverpool FC", "D) Real Madrid", "Real Madrid");
        question[2] = new Question(3,"In the 2003-2004 season, which English Premier League team went the entire season unbeaten, earning the nickname \"The Invincibles\"? ✨", "A) Manchester United", "B) Chelsea", "C) Arsenal", "D) Liverpool", "Arsenal");
        question[3] = new Question(4,"Which player has won the most Ballon d'Or awards in history? 🥇", "A) Cristiano Ronaldo", "B) Lionel Messi", "C) Michel Platini", "D) Johan Cruyff", "Lionel Messi");
        question[4] = new Question(5,"Who is the all-time leading goalscorer in the history of the FIFA World Cup? 🥅", "A) Ronaldo Nazário (Brazil)", "B) Gerd Müller (Germany)", "C) Just Fontaine (France)", "D) Miroslav Klose (Germany)", "Miroslav Klose (Germany)");
    }
    
    
    public void playQuiz(){
        int i = 0;
        for (Question q : question) {
            
            System.out.println("The question no is: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.print(" Enter--> "); 
            Selection[i] = sc.nextLine(); i++;
            System.out.println();
        } System.out.println();
        for(String s : Selection) {System.out.println(s);}
    }

    public void printScore(){
        int score = 0;
        for(int i=0 ; i < question.length;i++){
            Question que = question[i];
            String actualAns = que.getAnswer();
            String userAns = Selection[i];

        if(actualAns.equals(userAns) ){score++;}
    }
        System.out.println("The score is : "+score);}
    
}