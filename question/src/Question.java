import java.util.HashMap;

public abstract class Question {
    public static final String DEFAULT_CHOICE_TEXT = "default choice";
    public static final int DEFAULT_CHOICE_NUMBER = 1;
    public static final AnswerChoice DEFAULT_ANSWER_CHOICE =
            new AnswerChoice(Question.DEFAULT_CHOICE_TEXT, true);
    public static final HashMap<Integer, AnswerChoice> DEFAULT_ANSWER_CHOICE_LIST = new HashMap<>();
    private String questionText;
    private double pointValue;
    private HashMap<Integer, AnswerChoice> answerChoices = DEFAULT_ANSWER_CHOICE_LIST;

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

    public HashMap<Integer, AnswerChoice> getAnswerChoices() {
        return this.answerChoices;
    }

    public void setAnswerChoices(HashMap<Integer, AnswerChoice> answerChoices) {
        this.answerChoices = answerChoices;
    }
    public void displayQuestion() {
        System.out.println(this.getQuestionText());
        System.out.println();
        for (Integer choiceNumber : this.getAnswerChoices().keySet()) {
            System.out.println(choiceNumber + ") " +
                    this.getAnswerChoices().get(choiceNumber).getAnswerText());
        }
        System.out.println();
    }

    public void displayFaultyQuestion() {
        System.err.println(this.getQuestionText());
        System.err.println(this.getAnswerChoices());
    }

    public void makeDefaultAnswers() {
        Question.DEFAULT_ANSWER_CHOICE_LIST.putIfAbsent(
                Question.DEFAULT_CHOICE_NUMBER, Question.DEFAULT_ANSWER_CHOICE);
        this.setAnswerChoices(Question.DEFAULT_ANSWER_CHOICE_LIST);
    }

    /** This method lets a Question test the list of AnswerChoices it
     * currently holds for invalidity given the Question class.
     *
     * @return true if this Question has an invalid list of
     *         AnswerChoices for the Question class
     */
    public abstract boolean hasInvalidAnswers();
}
