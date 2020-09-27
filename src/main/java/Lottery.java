import java.io.*;
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
            System.out.println(lotteryNum[i]);
        }
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

    }
}



