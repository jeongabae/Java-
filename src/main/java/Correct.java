public class Correct {
    int correct;

    void correctUp() {
        ++correct;
    }

    void correctRe() {
        if (correct == 6) {
            System.out.println("축하합니다 1등입니다!");
        }
    }
}
