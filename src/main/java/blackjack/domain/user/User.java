package blackjack.domain.user;

import blackjack.domain.card.Card;
import blackjack.domain.card.Score;

import java.util.List;

public interface User {
    void append(Card card);

    Score calculateScore();

    boolean isBust();

    List<Card> getCards();

    boolean is(String name);

    String getName();

    Boolean isWinner(Score dealerScore);
}
