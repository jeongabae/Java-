package lottery;

import java.util.LinkedList;
import java.util.List;

public class CorrectNum {
    public List<LineNumber> user;
    private LineNumber oneLine;
    private RandomNum randomNum;

    public void ReadFile() {
        FileManager filemanager = new FileManager();

        user = filemanager.fileRead();
    }

    public void Correct() {
        ReadFile();
        oneLine = new LineNumber();
        randomNum = new RandomNum();
        int correctNum = 0;
        boolean bonusCorrect = false;
        int rank = 0;
        List<Integer> rankings = new LinkedList<>();

        System.out.println();
        Prize prize = new Prize();

        for (int i = 0; i < user.size(); i++) {
            oneLine = user.get(i);

            for (int j = 0; j < 6; j++)
                for (int k = 0; k < 6; k++)
                    if (oneLine.userNum[j] == randomNum.lotteryNum[k]) {
                        correctNum++;
                    }
            if (oneLine.userNum[6] == randomNum.lotteryNum[6]) {
                bonusCorrect = true;
            }
            prize.Ranking(correctNum, bonusCorrect);
            correctNum = 0;
            bonusCorrect = false;
        }
        prize.Print();
        System.out.println();
    }
}