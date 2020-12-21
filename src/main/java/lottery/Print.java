package lottery;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Print {
    public Print(List<Integer> rank) {
        Print(rank);
    }

    public void Print(List<Integer> rank) {
        boolean win = false;
        Collections.sort(rank);

        HashMap<Integer, String> rankGroup = new HashMap<>();
        rankGroup.put(1, "1등");
        rankGroup.put(2, "2등");
        rankGroup.put(3, "3등");
        rankGroup.put(4, "4등");
        rankGroup.put(5, "5등");
        rankGroup.put(6, "꽝");

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
