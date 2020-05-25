package domain;

public class LadderGameProgressService {
    private LadderGameProgressService() {
        throw new AssertionError();
    }

    public static LadderResult progress(PlayerRepository playerRepository, Ladder ladder) {
        return new LadderResult(playerRepository, ladder);
    }
}
