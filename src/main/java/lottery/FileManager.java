package lottery;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    List<LineNumber> user = new ArrayList<>();

    File memberDB = new File("/Users/jeongabae/IdeaProjects/project/src/main/java/blackjack/memberDB.txt");

    public List<LineNumber> fileRead() {
        try {
            BufferedReader br = new BufferedReader(new java.io.FileReader(memberDB));
            if (memberDB.exists()) {
                String number;

                while ((number = br.readLine()) != null) {
                    String[] lotteryNum = number.split(",");
                    int[] lotteryNumber = Arrays.stream(lotteryNum).mapToInt(Integer::parseInt).toArray();
                    LineNumber oneLineNum = new LineNumber();
                    oneLineNum.setUserNum(lotteryNumber);
                    user.add(oneLineNum);
                }
                br.close();
            } else {
                System.out.println("No File");
            }
        } catch (Exception e) {
        }
        return user;
    }
}
