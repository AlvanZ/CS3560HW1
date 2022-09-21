public class MCQuestion extends Question {
    private String[] answers;
    private String[] attempt;
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
     /** Prints out the result of attempt compared to answer
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
