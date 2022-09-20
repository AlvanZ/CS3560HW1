import java.util.ArrayList;
public class Student{
    private static ArrayList<String> ids = new ArrayList<>();
    private String id;
    private static VotingService service = new VotingService();
    private boolean submitted;
    private boolean right;
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
   public void submitMC(String[] answers){
      service.submitMC(answers, id, submitted);
      submitted = true;
   }
   public void submitSC(String answer){
      service.submitSC(answer, id, submitted);
      submitted = true;
   }

}