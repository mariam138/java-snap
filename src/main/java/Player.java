public class Player {
    String playerName;
    boolean playerWon;

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerWon = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean isPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(boolean playerWon) {
        this.playerWon = playerWon;
    }
}
