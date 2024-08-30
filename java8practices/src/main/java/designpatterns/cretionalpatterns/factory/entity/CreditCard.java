package DesignPatterns.cretionalpatterns.factory.entity;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.CardType;

import static DesignPatterns.cretionalpatterns.factory.entity.CardType.CREDIT_CARD;

public class CreditCard extends Card {

    @Override
    CardType getCardType() {
        return CREDIT_CARD;
    }
}
