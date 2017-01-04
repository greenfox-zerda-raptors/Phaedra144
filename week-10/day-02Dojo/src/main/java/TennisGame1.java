
public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGame1(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName()))
            player1.increaseScore();
        else
            player2.increaseScore();
    }

    public String getScore() {
        if (areScoresEqual()) {
            return getResultIfScoreEquals();
        } else if (player1.getScore() >= 4 || player2.getScore() >= 4) {
            return checkAfterDeuce();
        } else {
            return checkDuringGameIfNotEqual();
        }
    }

    private String getResultIfScoreEquals() {
        if (player1.getScore() < 3) {
            return getResultForPlayer(player1.getScore()) + "-All";
        } else {
            return "Deuce";
        }
    }

    private String checkDuringGameIfNotEqual() {
        return getResultForPlayer(player1.getScore()) + "-" + getResultForPlayer(player2.getScore());
    }

    private String getResultForPlayer(int playerScore) {
        String playerResult = "";
        switch (playerScore) {
            case 0:
                playerResult = "Love";
                break;
            case 1:
                playerResult = "Fifteen";
                break;
            case 2:
                playerResult = "Thirty";
                break;
            case 3:
                playerResult = "Forty";
                break;
        }
        return playerResult;
    }

    private String checkAfterDeuce() {
        int scoreDifference = Math.abs(player1.getScore() - player2.getScore());
        if (scoreDifference == 1) {
            return "Advantage " + getLeader();
        } else {
            return "Win for " + getLeader();
        }
    }

    private String getLeader() {
        return player1.getScore() > player2.getScore() ? player1.getName() : player2.getName();
    }

    private boolean areScoresEqual() {
        return player1.getScore() == player2.getScore();
    }
}
