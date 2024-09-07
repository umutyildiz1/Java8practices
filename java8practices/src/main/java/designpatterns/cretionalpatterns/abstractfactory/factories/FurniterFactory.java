package DesignPatterns.cretionalpatterns.abstractfactory.factories;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;


public interface FurniterFactory{
    Sofa createSofa();
    Chair createChair();

}

