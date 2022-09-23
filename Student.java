import java.util.ArrayList;
public class Student{
    //Class Variables
    private static VotingService service = new VotingService();


    //Instance Variables
    private String name;
    private boolean submitted;
    private boolean right;
    private static int id;
    //Constructor
    public Student(String name){
        id++;
        this.name = name;
        service = new VotingService(Integer.toString(id));
        
    }

    //Methods
     /** Submits the student's attempt to Voting Service
       @param answers  The entry that will be submitted to service for multiple choice answers
     */
   public void submitMC(String[] answers){
      service.submitMC(answers, Integer.toString(id), submitted);
      submitted = true;
   }
    /** Submits the student's attempt to Voting Service
       @param answer  The entry that will be submitted to service for single choice answers
     */
   public void submitSC(String answer){
      service.submitSC(answer, Integer.toString(id), submitted);
      submitted = true;
   }
     /** Resets the student's data of submitted and 
     */
   public void reset(){
    submitted = false;
    right = false;
   }

}