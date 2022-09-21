import java.util.ArrayList;
public class Student{
    //Class Variables
    private static VotingService service = new VotingService();
    private static ArrayList<String> ids = new ArrayList<>();

    //Instance Variables
    private String id;
    private boolean submitted;
    private boolean right;

    //Constructor
    public Student(String id){

        if(ids.contains(id)){
            throw new IllegalStateException("ID is already taken");
        }
        else{
        ids.add(id);
        this.id = id;
        service = new VotingService(id);
        }
        
    }

    //Methods
     /** Submits the student's attempt to Voting Service
       @param answers  The entry that will be submitted to service for multiple choice answers
     */
   public void submitMC(String[] answers){
      service.submitMC(answers, id, submitted);
      submitted = true;
   }
    /** Submits the student's attempt to Voting Service
       @param answer  The entry that will be submitted to service for single choice answers
     */
   public void submitSC(String answer){
      service.submitSC(answer, id, submitted);
      submitted = true;
   }
     /** Resets the student's data of submitted and right
     */
   public void reset(){
    submitted = false;
    right = false;
   }

}