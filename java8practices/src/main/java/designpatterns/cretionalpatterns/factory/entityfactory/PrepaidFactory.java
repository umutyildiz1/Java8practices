package DesignPatterns.cretionalpatterns.factory.entityfactory;

import DesignPatterns.cretionalpatterns.factory.entity.Card;
import DesignPatterns.cretionalpatterns.factory.entity.PrepaidCard;

public class PrepaidFactory implements CardFactory{
    @Override
    public Card create() {
        return new PrepaidCard();
    }
}
