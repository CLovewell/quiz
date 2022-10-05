import java.util.HashMap;

public class QuizRunner {
    public static void main(String... args) {
        AnswerChoice mariahMC = new AnswerChoice("Mariah", true);
        AnswerChoice davidMC = new AnswerChoice("David", false);
        AnswerChoice lawrenceMC = new AnswerChoice("Lawrence", false);
        AnswerChoice springerMC = new AnswerChoice("Springer", true);
        HashMap<Integer, AnswerChoice> multipleChoices = new HashMap<>();
        multipleChoices.put(1, mariahMC);
        multipleChoices.put(2, davidMC);
        multipleChoices.put(3, lawrenceMC);
        multipleChoices.put(4, springerMC);
        MultipleChoiceQuestion firstMiddleName = new MultipleChoiceQuestion(
                "What is my first middle name?", 1, multipleChoices
        );

        AnswerChoice yep = new AnswerChoice("True", true);
        AnswerChoice nope = new AnswerChoice("False", true);
        HashMap<Integer, AnswerChoice> trueFalseChoices = new HashMap<>();
        trueFalseChoices.put(1, yep);
        trueFalseChoices.put(2, nope);
        TrueFalseQuestion threeMiddlesNames = new TrueFalseQuestion("True or false: " +
                "I have three middle names.", 1, trueFalseChoices);

        AnswerChoice carnahanCB = new AnswerChoice("Carnahan", true);
        AnswerChoice lovewellCB = new AnswerChoice("Lovewell", true);
        AnswerChoice mariahCB = new AnswerChoice("Mariah", true);
        AnswerChoice davidCB = new AnswerChoice("David", true);
        AnswerChoice lawrenceCB = new AnswerChoice("Lawrence", true);
        AnswerChoice springerCB = new AnswerChoice("Springer", true);
        HashMap<Integer, AnswerChoice> checkboxChoices = new HashMap<>();
        checkboxChoices.put(1, carnahanCB);
        checkboxChoices.put(2, lovewellCB);
        checkboxChoices.put(3, mariahCB);
        checkboxChoices.put(4, davidCB);
        checkboxChoices.put(5, lawrenceCB);
        checkboxChoices.put(6, springerCB);
        CheckboxQuestion whichNames = new CheckboxQuestion("Which of the following names are " +
                "on my birth certificate?", 1, checkboxChoices);

        firstMiddleName.displayQuestion();
        threeMiddlesNames.displayQuestion();
        whichNames.displayQuestion();
    }
}
