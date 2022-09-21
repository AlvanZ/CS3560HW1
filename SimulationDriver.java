public class SimulationDriver{
    public static void main(String[] args){
        //Testing for Single choice with 2 student
        VotingService service = new VotingService();
        service.createQuestion("Single Choice", "What is my name");
        service.setAnswerSC("D. Alvan");
        Student alvan = new Student("AlvanZ");
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

        //Testing Multiple Choice
        alvan.reset();
        service.createQuestion("Multiple Choice", "Who helped create Billy");
        String[] answers = {"Mom", "Dad"};
        service.setAnswersMC(answers);
        String[] choices1 = {"Mom", "Dad", "Uncle Tom", "Rick"};
        service.setChoices(choices1);
        alvan.submitMC(answers);
        service.print();
        service.output();
        String[] ans = {"Hello" , "Bob"};
        alvan.submitMC(ans);
        service.output();
    }

}