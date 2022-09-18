
public class VotingService {
 private MCQuestion[] test;
 private Answer[] answers;
 private String[] results;
 public VotingService(int numOfQuestions){
    test = new MCQuestion[numOfQuestions];
    answers = new Answer[numOfQuestions];
    results = new String[numOfQuestions];
 }
 public int resultsLength(){
    return results.length;
 }
 
 public void solve(String[] key){
    String correct = "Your answer is correct, ";
    String incorrect = "Your answer is incorrect, the correct answer is ";
    for(int i =0; i<key.length; i++){
        if(key.equals(answers[i].getAnswer())){
            System.out.println(correct + answers[i] + " ");
        }
        else{
            System.out.println(incorrect + answers[i] + " ");
        }
    }
 }
}
