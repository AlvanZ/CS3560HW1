public class Student{
    private String id;
    private VotingService service;
    public Student(String id){
        this.id = id;
    }
    public Student(String id, int testQuestions){
        this.id = id;
        VotingService service = new VotingService( testQuestions);
    }

}