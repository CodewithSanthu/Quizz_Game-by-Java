package quizzapp;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
	        quizz quiz = new quizz();
	        
	        String[] options1 = {"Java", "Python", "C++", "JavaScript"};
	        quiz.addQuestion(new question("Which language is platform-independent?", options1, "Java"));

	        String[] options2 = {"1995", "1996", "2000", "2005"};
	        quiz.addQuestion(new question("When was Java first released?", options2, "1995"));

	        String[] options3 = {"JVM", "JRE", "JDK", "JIT"};
	        quiz.addQuestion(new question("Which component is responsible for running Java programs?", options3, "JVM"));

	        quiz.start();
	    }
	}



