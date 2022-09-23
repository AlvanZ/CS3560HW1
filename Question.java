public class Question {
  //Instance variables
    protected String[] choices;
    private String question;
    private String answers;
    public Question(){
        choices = null;
        question = "";
        answers = "";
    }
    //Constructors
   public Question(String question, String[] choices, String answers){
    this.question = question;
    this.choices = choices;
    this.answers = answers;
   }
   public Question(String question){
    this.question = question;
    System.out.println("Single Choice");
   }



   //Methods: 
   
   /** Print's the question and the choices to the user and number of answers
     */
   public void print(){
    System.out.println(question);
    System.out.println("There is only one answer, Choices: ");
    for(int i =0; i<choices.length; i++){
        System.out.println(choices[i] + " ");
    }
   }
  /** Sets Question's question to their input
       @param question  The entry that question will become
     */
   public void setQuestion(String question){
    this.question = question;
   }
  /** Set's answer to the string ans that the user inputs 
   *  @param ans  The entry the user gives for answer
  */
   public void setAnswer(String ans){
    answers = ans;
   }
   /** Returns answer instance variable
    */
   public String getAnswer(){
    return answers;
   }
    /** Return's the question string
     */
   public String getQuestion(){
    return question;
   }
     /** Sets choices to their input
       @param choices  The entry that choices will become
     */
   public void setChoices(String[] choices){
    this.choices = choices;
   }
     /** Checks if the answer is correct
       @param attempt  The user's attempt that is being checked
     */
   public boolean check(String attempt){
   return attempt.equals(answers);
   }
   
}
