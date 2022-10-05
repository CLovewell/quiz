import java.util.HashMap;
public class MultipleChoiceQuestion extends Question {
    public MultipleChoiceQuestion(String questionText, int pointValue,
                                  HashMap<Integer, AnswerChoice> answerChoices) {
        this.setQuestionText(questionText);
        this.setPointValue(pointValue);
        this.setAnswerChoices(answerChoices);
        //Exactly one AnswerChoice should contain "true" as its Boolean value.
        //If not, print an error message and construct a MultipleChoiceQuestion with
        //a default choice list.
        if (this.hasInvalidAnswers()) {
            System.err.println("A multiple choice question must have exactly one correct answer. " +
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
            if (trueCount > 1) {
                break;
            }
        }
        return trueCount != 1;
    }
}