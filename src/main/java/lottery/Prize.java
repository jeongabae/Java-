package lottery;

import java.util.*;

public class Prize {
    public List<Integer> rank = new LinkedList<>();
    public int ranking;

    public void Ranking(int correctNum, boolean bonusCorrect) {

        if (correctNum == 3) {
            ranking = 5;
        } else if (correctNum == 4) {
            ranking = 4;
        } else if (correctNum == 5 && bonusCorrect != false) {
            ranking = 3;
        } else if (correctNum == 5 && bonusCorrect == true) {
            ranking = 2;
        } else if (correctNum == 6) {
            ranking = 1;
        } else {
            ranking = 6;
        }
        rank.add(ranking);
    }
}