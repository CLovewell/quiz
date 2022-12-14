public class AnswerChoice {
    private String answerText;
    private boolean isCorrect;

    public AnswerChoice(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void changeTruthValue() {
        isCorrect = !isCorrect;
    }

    @Override
    public String toString() {
        return this.getAnswerText() + " - " + this.isCorrect();
    }
}
