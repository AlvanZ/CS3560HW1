public class Answer {
    private String answer;
    public Answer(String ans){
        answer = ans;
    }
    public void print(){
        System.out.println(answer);
    }
    public String getAnswer(){
        return answer;
    }
    public boolean checkAnswer(String attempt){
        if(attempt.equals(answer)){
            return true;
        }
        else{
            return false;
        }
    }
}
