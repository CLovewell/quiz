public abstract class Question {
    private String questionText;
    private double pointValue;

    public String getQuestionText() {
        return this.questionText;
    }
    public void setQuestionText(String text) {
        this.questionText = text;
    }
    public double getPointValue() {
        return this.pointValue;
    }
    public void setPointValue(double value) {
        this.pointValue = value;
    }
    public abstract void displayQuestion();
}
