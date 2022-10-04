import java.util.Scanner;

public class TrueFalseQuestion extends Question{
    private boolean correctAnswer;
    public void displayQuestion() {
        System.out.println(this.getQuestionText());
        System.out.println();
        System.out.println("0 - false");
        System.out.println("1 - true");
    }

    //TODO provide validation. User must enter 0 or 1.
    public boolean getAnswer(Scanner in) {
        int answer = in.nextInt();
        return answer % 2 == 1; //return false if answer is 0 and true if answer is 1
    }
}