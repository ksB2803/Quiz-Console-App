public class Question {
    private int id;
    private String Question;
    private String Opt1;
    private String Opt2;
    private String Opt3;
    private String Opt4;
    private String Answer;
    
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        Question = question;
        Opt1 = opt1;
        Opt2 = opt2;
        Opt3 = opt3;
        Opt4 = opt4;
        Answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return Question;
    }
    public void setQuestion(String question) {
        Question = question;
    }
    public String getOpt1() {
        return Opt1;
    }
    public void setOpt1(String opt1) {
        Opt1 = opt1;
    }
    public String getOpt2() {
        return Opt2;
    }
    public void setOpt2(String opt2) {
        Opt2 = opt2;
    }
    public String getOpt3() {
        return Opt3;
    }
    public void setOpt3(String opt3) {
        Opt3 = opt3;
    }
    public String getOpt4() {
        return Opt4;
    }
    public void setOpt4(String opt4) {
        Opt4 = opt4;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question{");
        sb.append("id=").append(id);
        sb.append(", Question=").append(Question);
        sb.append(", Opt1=").append(Opt1);
        sb.append(", Opt2=").append(Opt2);
        sb.append(", Opt3=").append(Opt3);
        sb.append(", Opt4=").append(Opt4);
        sb.append(", Answer=").append(Answer);
        sb.append('}');
        return sb.toString();
    }

    
}
