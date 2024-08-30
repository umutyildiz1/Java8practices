package DesignPatterns.cretionalpatterns.factory.entityfactory;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.DebitCard;

public class DebitFactory implements CardFactory{
    @Override
    public Card create() {
        return new DebitCard();
    }
}
