package DesignPatterns.cretionalpatterns.factory.entity;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.CardType;

import static DesignPatterns.cretionalpatterns.factory.entity.CardType.DEBIT_CARD;

public class DebitCard extends Card {

    @Override
    CardType getCardType() {
        return DEBIT_CARD;
    }
}
