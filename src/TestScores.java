public class TestScores {
private final int[] scores;

public TestScores(int[] scores) {
    this.scores = scores;
}

public int getAverage() {
    int sum = 0;

    if(scores.length == 0) {
        return 0;
    }

    for(int score: scores) {
        if(score < 0 || score > 100) {
            throw new IllegalArgumentException("Score is not valid!");
        }
        sum += score;
    }
    return sum/scores.length;
}
}