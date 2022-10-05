import java.util.Scanner;
import java.util.HashMap;

public class TrueFalseQuestion extends Question{
    public TrueFalseQuestion(String questionText, int pointValue,
                             HashMap<Integer, AnswerChoice> answerChoices) {
        this.setQuestionText(questionText);
        this.setPointValue(pointValue);
        this.setAnswerChoices(answerChoices);
        if (this.hasInvalidAnswers()){
            System.err.println("A true/false question must have exactly one correct " +
                    "answer and exactly one incorrect answer. Rewrite the following " +
                    "question:");
            this.displayFaultyQuestion();
            this.makeDefaultAnswers();
        }
    }

    //TODO provide validation. User must enter 0 or 1.
    public boolean getAnswer(Scanner in) {
        int answer = in.nextInt();
        return answer % 2 == 1; //return false if answer is 0 and true if answer is 1
    }

    @Override
    public boolean hasInvalidAnswers() {
        if (this.getAnswerChoices().size() != 2) {
            return true;
        }
        int trueCount = 0;
        for (Integer choice : this.getAnswerChoices().keySet()) {
            if (this.getAnswerChoices().get(choice).isCorrect()) {
                trueCount++;
            }
            if (trueCount > 1) {
                break;
            }
        }
        return trueCount != 1;
    }
}