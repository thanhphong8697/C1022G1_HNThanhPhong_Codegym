package CleanCodeAndRefactory;

public class TennisGame{
    public static String getScore(String playerName1, String playerName2, int scorePlayerName1, int scorePlayerName2) {
        String score = "";
        int tempScore = 0;
        if (scorePlayerName1 == scorePlayerName2){
            switch (scorePlayerName1){
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }else if (scorePlayerName1 >= 4 || scorePlayerName2 >= 4){
            int minusResult = scorePlayerName1 -  scorePlayerName2;
            if (minusResult == 1){
                score = "Advantage player1";
            }else if (minusResult == -1){
                score = "Advantage player2";
            }else if (minusResult >= 2){
                score = "Win for player1";
            }else {
                score = "Win for player2";
            }
        }else {
            for (int i = 1; i < 3; i++){
                if (i == 1){
                    tempScore = scorePlayerName1;
                }else {
                    score += "-";
                    tempScore = scorePlayerName2;
                }
                switch (tempScore){
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Fourty";
                        break;
                }
            }
        }
        return score;
    }
}
