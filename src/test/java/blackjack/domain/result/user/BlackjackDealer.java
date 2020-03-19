package blackjack.domain.result.user;

import blackjack.domain.playing.card.Score;

public class BlackjackDealer extends AbstractUserForTest {
    @Override
    public Score calculateScore() {
        return new Score(21);
    }

    @Override
    public boolean isBlackjack() {
        return true;
    }
}
