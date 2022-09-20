public class SimulationDriver{
    public static void main(String[] args){
        Student alvan = new Student("AlvanZ");
        VotingService service = new VotingService();
        service.createQuestion("Single Choice", "What is my name");
        service.setAnswerSC("D. Alvan");
        
        String[] temp = {"A. Billy", "B. Bob", "C. Tommy", "D. Alvan"};
        service.setChoices(temp);
        service.print();
        Student alvan2= new Student("AlvanZ1");
    
        alvan2.submitSC("A. Billy");
        alvan.submitSC("D. Alvan");
        service.output();
        alvan.submitSC("A. Billy");
        service.output();
        alvan2.submitSC("D. Alvan");
        service.output();

    }
}