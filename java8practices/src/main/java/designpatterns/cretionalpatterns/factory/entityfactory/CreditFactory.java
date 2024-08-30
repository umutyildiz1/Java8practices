package DesignPatterns.cretionalpatterns.factory.entityfactory;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.CreditCard;

public class CreditFactory implements CardFactory{
    @Override
    public Card create() {
        return new CreditCard();
    }
}
