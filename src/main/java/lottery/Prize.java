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

//    public void Sort(){
//        Arrays.sort(new List[]{rank});
//
//    }

    public void Print() {
        boolean win = false;
        Collections.sort(rank);

        HashMap<Integer, String> rankGroup = new HashMap<>();
        rankGroup.put(1, "1등");
        rankGroup.put(2, "2등");
        rankGroup.put(3, "3등");
        rankGroup.put(4, "4등");
        rankGroup.put(5, "5등");
        rankGroup.put(6, "꽝");
        System.out.println(rankGroup.get(rank.get(0)) + ", " + rankGroup.get(rank.get(1)) + ", " +
                rankGroup.get(rank.get(2)) + ", " + rankGroup.get(rank.get(3)) + ", " + rankGroup.get(rank.get(4)));
        if (rank.get(0) != 6) {
            System.out.println("당첨");
            System.out.println("최고 등수 : " + rankGroup.get(rank.get(0)));
            System.out.println("총 결과 ");
            System.out.println(rankGroup.get(rank.get(0)) + ", " + rankGroup.get(rank.get(1)) + ", " +
                    rankGroup.get(rank.get(2)) + ", " + rankGroup.get(rank.get(3)) + ", " + rankGroup.get(rank.get(4)));
        } else {
            System.out.println("다음기회에..");
        }

    }
}