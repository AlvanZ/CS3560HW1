public class Question {
    protected String[] choices;
    private String question;
    private String answers;
    public Question(){
        choices = null;
        question = "";
        answers = "";
    }
   public Question(String question, String[] choices, String answers){
    this.question = question;
    this.choices = choices;
    this.answers = answers;
   }
   public Question(String question){
    this.question = question;
    System.out.println("Single Choice");
   }
   /** Print's the question and the choices to the user and number of answers
     */
   public void print(){
    System.out.println(question);
    System.out.println("There is only one answer, Choices: ");
    for(int i =0; i<choices.length; i++){
        System.out.println(choices[i] + " ");
    }
   }
   public void setQuestion(String question){
    this.question = question;
   }
   public void setAnswer(String ans){
    answers = ans;
   }
   public String getAnswer(){
    return answers;
   }
    /** Return's the question string
     */
   public String getQuestion(){
    return question;
   }
   public void setChoices(String[] choices){
    this.choices = choices;
   }
   public boolean check(String attempt){
   return attempt.equals(answers);
   }
   
}
