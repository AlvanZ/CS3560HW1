public class MCQuestion {
    private String[] choices;
    private String question;
   public MCQuestion(String question, String[] choices){
    this.question = question;
    this.choices = choices;
   }
   public void print(){
    System.out.println(question);
    System.out.println("Choices: ");
    for(int i =0; i<choices.length; i++){
        System.out.println(choices[i] + " ");
    }
   }
}