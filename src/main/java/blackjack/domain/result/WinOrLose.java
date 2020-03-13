package blackjack.domain.result;

import java.util.Arrays;

public enum WinOrLose {
    WIN("승", true),
    LOSE("패", false);

    private String name;
    private boolean isWinner;

    WinOrLose(String name, boolean isWinner) {
        this.name = name;
        this.isWinner = isWinner;
    }

    public static WinOrLose of(boolean isWinner) {
        return Arrays.stream(values())
                .filter(winOrLose -> isWinner == winOrLose.isWinner)
                .findFirst()
                .get();
    }

    public String getName() {
        return name;
    }

    public WinOrLose reverse() {
        return WinOrLose.of(!this.isWinner);
    }
}
