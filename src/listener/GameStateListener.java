package listener;

public interface GameStateListener extends Listener {
    void onPlayerStartRound(int player);

    void onPlayerEndRound(int player);
}
