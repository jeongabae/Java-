public class Correct extends Prize {
    int correct;
    int bonus;
    Boolean win = false;
    int rank;


    void correctUp() {
        ++correct;
    }

    void bonusUp() {
        ++bonus;
    }

    void winLottery() {
        if (3 <= correct && correct <= 6) {
            win = true;
        }
    }

    void correctRe() {
        switch (correct) {
            case 6:
                rank = 1;
                break;
            case 5:
                if (bonus == 1) {
                    rank = 2;

                } else {
                    rank = 3;
                }
                break;
            case 4:
                rank = 4;
                break;

            case 3:
                rank = 5;
                break;
        }

    }

    void rankNum() {
        switch (rank) {
            case 1:
                result.add("1등");
                break;
            case 2:
                result.add("2등");

                break;
            case 3:
                result.add("3등");

                break;
            case 4:
                result.add("4등");

                break;
            case 5:
                result.add("5등");
                break;
            default:
                result.add("꽝");
        }
    }

}

