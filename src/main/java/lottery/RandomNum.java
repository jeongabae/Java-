package lottery;

public class RandomNum {
    int[] lotteryNum = new int[7];

    public RandomNum() {
        Random();
    }

    public void Random() {
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
        System.out.print("당첨 번호 : ");
        for (int i = 0; i < lotteryNum.length; i++)
//            System.out.println("lotterynum[" + i + "]" + lotteryNum[i]);
            System.out.print(lotteryNum[i] + " ");
    }
}
