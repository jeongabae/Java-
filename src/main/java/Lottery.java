import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        String a = "";

        try {
            FileReader fr = new FileReader("/Users/jeongabae/IdeaProjects/homework/src/main/java/text1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.trim().length() > 0) {
                    a += line + ",";
                }
            }
            //System.out.println("line : "+a);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] fileNum = a.split(",");
//        for (int i=0;i<fileNum.length;i++){
//            System.out.println(fileNum[i]);
//        }
        int[] nums = Arrays.stream(fileNum).mapToInt(Integer::parseInt).toArray();
//        for (int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
        int[] lotteryNum = new int[7];
        for (int i = 0; i < lotteryNum.length; i++) {
            lotteryNum[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotteryNum[j] == lotteryNum[i]) {
                    lotteryNum[i] = (int) (Math.random() * 45) + 1;
                    i--;
                    break;
                }
            }
        }
//        for (int i = 0; i < lotteryNum.length; i++)
//            System.out.println("lotterynum[" + i + "]" + lotteryNum[i]);
        Correct c1 = new Correct();
        Correct c2 = new Correct();
        Correct c3 = new Correct();
        Correct c4 = new Correct();
        Correct c5 = new Correct();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (nums[j] == lotteryNum[i]) {
                    c1.correctUp();
                }
            }
            for (int j = 7; j < 13; j++) {
                if (nums[j] == lotteryNum[i]) {
                    c2.correctUp();
                }
            }
            for (int j = 14; j < 20; j++) {
                if (nums[j] == lotteryNum[i]) {
                    c3.correctUp();
                }
            }
            for (int j = 21; j < 28; j++) {
                if (nums[j] == lotteryNum[i]) {
                    c4.correctUp();
                }
            }
            for (int j = 29; j < 34; j++) {
                if (nums[j] == lotteryNum[i]) {
                    c5.correctUp();
                }
            }
        }
        if (nums[6] == lotteryNum[6]) {
            c1.bonusUp();
        }
        if (nums[13] == lotteryNum[6]) {
            c2.bonusUp();
        }
        if (nums[20] == lotteryNum[6]) {
            c3.bonusUp();
        }
        if (nums[27] == lotteryNum[6]) {
            c4.bonusUp();
        }
        if (nums[34] == lotteryNum[6]) {
            c5.bonusUp();
        }
        c1.winLottery();
        c1.correctRe();
        c1.rankNum();
        c2.winLottery();
        c2.correctRe();
        c2.rankNum();

        c3.winLottery();
        c3.correctRe();
        c3.rankNum();

        c4.winLottery();
        c4.correctRe();
        c4.rankNum();

        c5.winLottery();
        c5.correctRe();
        c5.rankNum();


//        System.out.println("c1: " + c1.win + " c2: " + c2.win + " c3: " + c3.win + " c4: " + c4.win + " c5: " + c5.win);
//        System.out.println("c1: " + c1.correct + " c2: " + c2.correct + " c3: " + c3.correct + " c4: " + c4.correct + " c5: " + c5.correct);
//        System.out.println("c1: " + c1.rank + " c2: " + c2.rank + " c3: " + c3.rank + " c4: " + c4.rank + " c5: " + c5.rank);
        int arr[] = {c1.rank, c2.rank, c2.rank, c4.rank, c5.rank};
        int maxRank = 6;
        for (int i = 0; i < arr.length; i++) {
            if (0 < arr[i] && arr[i] < maxRank) {
                maxRank = arr[i];
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
//        String rankSort = Arrays.toString(arr);
//        System.out.println("등수배열 "+rankSort);
        Prize prize = new Prize();
        for (int i = 0; i < prize.result.size(); i++)
            System.out.println("등수" + prize.result.get(i));

        if (c1.win || c2.win || c3.win || c4.win || c5.win) {
            System.out.println("당첨");
            System.out.println("최고 등수: " + maxRank + "등");
            System.out.println("총결과");
//                System.out.println(+","++","+);
        } else {
            System.out.println("다음기회에...");
        }
    }
}




