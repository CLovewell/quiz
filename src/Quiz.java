import java.util.ArrayList;
public class Quiz {
    private ArrayList<Question> questions;
    private double pointsPossible;
    private double pointsEarned;

    public double getScore() {
        return pointsEarned / pointsPossible;
    }
}
