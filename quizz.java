package quizzapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class quizz {
	    private List<question> questions;
	    private int score;
	    public quizz() {
	        this.questions = new ArrayList<>();
	        this.score = 0;
	        }
	    public void addQuestion(question question) {
	        questions.add(question);
	        }
	    public void start() {
	        Scanner scanner = new Scanner(System.in);
	        
	        for (question question : questions) {
	            System.out.println(question.getQuestionText());
	            String[] options = question.getOptions();
	            for (int i = 0; i < options.length; i++) {
	                System.out.println((i + 1) + ": " + options[i]);
	            }
	            
	            System.out.print("Your answer: ");
	            int choice = scanner.nextInt();
	            
	            while (choice < 1 || choice > options.length) {
	                System.out.print("Invalid choice. Please try again: ");
	                choice = scanner.nextInt();
	                }
       
	            if (question.isCorrect(options[choice - 1])) {
	                System.out.println("Correct!\n");
	                score++;
	                } 
	            else {
	                System.out.println("Incorrect. The correct answer was: " + question.getCorrectAnswer() + "\n");
	                }
	         }
	        
	        System.out.println("Your final score is: " + score + "/" + questions.size());
	        scanner.close();
	    }
}



