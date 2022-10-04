import java.util.HashMap;
public class MultipleChoiceQuestion extends Question {
    private HashMap<String, Boolean> choices;

    public MultipleChoiceQuestion(String questionText, HashMap<String, Boolean> aChoices) {
        this.setQuestionText(questionText);
        this.choices = aChoices;
    }
    public void displayQuestion() {
        System.out.println(this.getQuestionText());
        System.out.println();
        int letter = 97;
        for (String choice : choices.keySet()) {
            System.out.print("(" + (char) letter + ") ");
            letter++;
            System.out.println(choice);
        }
    }

}