package quizzapp;
public class question {
	    private String questionText;
	    private String[] options;
	    private String correctAnswer;

	    public question(String questionText, String[] options, String correctAnswer) {
	        this.questionText = questionText;
	        this.options = options;
	        this.correctAnswer = correctAnswer;
	    }

	    public String getQuestionText() {
	        return questionText;
	    }

	    public String[] getOptions() {
	        return options;
	    }

	    public String getCorrectAnswer() {
	        return correctAnswer;
	    }

	    public boolean isCorrect(String answer) {
	        return answer.equalsIgnoreCase(correctAnswer);
	    }
	}



