import java.util.HashMap;
public class VotingService {
private static int correct = 0;
private static int wrong = 0;
 private static Question test;
 private static HashMap<String, Integer> studentResults = new HashMap();
 private String[] choices;
 public VotingService(){
   
 }
 public VotingService(String studentId){   
  studentResults.put(studentId, -1);
 }

 public void output(){
    System.out.println("Correct: " + correct);
    System.out.println("Wrong: " + wrong);
 }
 public void createQuestion(String type, String question){
    if(type.equalsIgnoreCase("MC") || type.trim().equalsIgnoreCase("Multiple Choice")){
        test = new MCQuestion(question);
    }
    else{
        test = new Question(question);
    }
 }
 public void setAnswerSC(String answer){
    test.setAnswer(answer);
 }
 public void setChoices(String[] choices){
    test.setChoices(choices);
 }
 public void print(){
    test.print();
 }
public boolean submitMC(String[] attempt, String id, boolean submitted){
   boolean att =  ((MCQuestion)test).check(attempt);
   boolean right = studentResults.get(id)==1;
 if( att && !submitted){

    correct++;
    studentResults.put(id, 1);
 }
 else if(!att && !submitted){
    studentResults.put(id, 0);
    wrong++;
 }
 else{
    if(submitted && !right){
            if(att){
                wrong--;
                correct++;
                studentResults.put(id, 1);
            }
        }
        else{
           if(submitted && right){
               if(!att){
                   correct--;
                   wrong++;
                   studentResults.put(id, 0);
               }
           }
          else if(!att){
               wrong++;
              studentResults.put(id, 0);
           }
           else{
               if(submitted && right){
                   if(!att){
                       correct--;
                       wrong++;
                       studentResults.put(id, 0);
                   }
               }
              else if(!att){
                   wrong++;
                  studentResults.put(id, 0);
               }
           }
       }
       }
 return att;
}
public boolean submitSC(String attempt, String id, boolean submitted){
    boolean att =  test.check(attempt);
    boolean right = studentResults.get(id)==1;
  if( att && !submitted){
     correct++;
     studentResults.put(id, 1);
  }
  else if(!att && !submitted){
     wrong++;
     studentResults.put(id, 0);
  }
  else{
     if(submitted && !right){
             if(att){
                 wrong--;
                 correct++;
                 studentResults.put(id, 1);
             }
         }
         else{
            if(submitted && right){
                if(!att){
                    correct--;
                    wrong++;
                    studentResults.put(id, 0);
                }
            }
           else if(!att){
                wrong++;
               studentResults.put(id, 0);
            }
            else{
                if(submitted && right){
                    if(!att){
                        correct--;
                        wrong++;
                        studentResults.put(id, 0);
                    }
                }
               else if(!att && !submitted){
                    wrong++;
                   studentResults.put(id, 0);
                }
            }
        }
     }
   
  
  return att;
 }

}
