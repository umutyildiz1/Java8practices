package DesignPatterns.cretionalpatterns.factory.entity;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.CardType;

import static DesignPatterns.cretionalpatterns.factory.entity.CardType.PREPAID_CARD;

public class PrepaidCard extends Card {

    @Override
    CardType getCardType() {
        return PREPAID_CARD;
    }
}
