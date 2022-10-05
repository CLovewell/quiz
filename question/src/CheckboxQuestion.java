import java.util.HashMap;
public class CheckboxQuestion extends Question {
    public CheckboxQuestion(String questionText, int pointValue,
                            HashMap<Integer, AnswerChoice> answerChoices) {
        this.setQuestionText(questionText);
        this.setPointValue(pointValue);
        this.setAnswerChoices(answerChoices);
        if (this.hasInvalidAnswers()) {
            System.err.println("A checkbox question must have at least two correct answers. " +
                    "Rewrite the following question:");
            this.displayFaultyQuestion();
            this.makeDefaultAnswers();
        }
    }

    @Override
    public boolean hasInvalidAnswers() {
        int trueCount = 0;
        for (Integer choice : this.getAnswerChoices().keySet()) {
            if (this.getAnswerChoices().get(choice).isCorrect()) {
                trueCount++;
            }
            if (trueCount == 2) {
                break;
            }
        }
        return trueCount < 2;
    }
}
