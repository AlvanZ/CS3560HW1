public class MCQuestion extends Question {
    //Instance Variables
    private String[] answers;
    private String[] attempt;


    //Constructors
    public MCQuestion(String question, String[] answers){
        setQuestion(question);
        this.answers = answers;
        attempt = new String[answers.length];
    }
    public MCQuestion(){
        setQuestion(" ");
        this.answers = null;
        this.attempt = null;
    }
    public MCQuestion(String question){
        setQuestion(question);
       }

    //Methods
    /** Sets user's attempt answers to their input
       @param attempts  The entry that attempt will become
     */
    public void setAttempt(String[] attempts){
        attempt = attempts;
    }
     /** Sets question's answers to their input
       @param answers  The entry that answers will become
     */
    public void setAnswer(String[] answers){
        this.answers= answers;
    }
     /** Modfifed version of check where it checks the String array because there is multiple answers
      * @param attempt The entry that the method checks to see if it's the same as answer
     */
    public boolean check(String[] attempt){
        if(attempt.length != answers.length){
            return false;
        }
        int correct =0;
        for(int i =0; i<attempt.length; i++){
            if(attempt[i].equals(answers[i])){
                correct++;
            }
        }
        return correct==answers.length;
    }
    
     /** Print's the question and the choices to the user and number of answers
     */
    public void print(){
        System.out.println(super.getQuestion());
        System.out.println("There is " + answers.length + " answers, choices: ");
        for(int i =0; i<choices.length; i++){
            System.out.println(choices[i] + " ");
        }
    }
}
