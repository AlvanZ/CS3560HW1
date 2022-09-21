import java.util.HashMap;
public class VotingService {
    //Class variables
private static int correct;
private static int wrong;
 private static Question test;
 private static HashMap<String, Integer> studentResults;
 private static boolean changedQuestion;

//Constructors
 public VotingService(){
 }
 public VotingService(String studentId){   
  studentResults.put(studentId, -1);
 }


 //Methods
 
   /** Prints out the amount of students correct and wrong
     */
 public void output(){
    System.out.println("Correct: " + correct);
    System.out.println("Wrong: " + wrong);
 }
   /** Creates a new question for the students to answers with things reset.
       @param type  The entry that will determine the type of question it will be
       @param question The entry that will be the question the students will be prompted
     */
 public void createQuestion(String type, String question){
        correct = 0;
        wrong = 0;
    studentResults = new HashMap();

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
 public void setAnswersMC(String[] answers){
    ((MCQuestion)test).setAnswer(answers);
 }
 public void setChoices(String[] choices){
    test.setChoices(choices);
 }
 public void print(){
    test.print();
 }
    /** Submits the answers the user prompts and utilizes their id and submitted, updates the HashMap
       @param attempt The entry that is the attempt at the question from the student, for the multiple choice question, that has multiple answers.
       @param id The entry is the student's id
       @param submitted Determines whether or not the student has already tried the problem and whether or not to update it
     */
public boolean submitMC(String[] attempt, String id, boolean submitted){
    if(!studentResults.containsKey(id)){
        studentResults.put(id, -1);
    }
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
    /** Submits the answer the user prompts and utilizes their id and submitted, updates the HashMap
       @param attempt The entry that is the attempt at the question from the student, for single choice answer with 1 answer.
       @param id The entry is the student's id
       @param submitted Determines whether or not the student has already tried the problem and whether or not to update it
     */
public boolean submitSC(String attempt, String id, boolean submitted){
    if(!studentResults.containsKey(id)){
        studentResults.put(id, -1);
    }
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
