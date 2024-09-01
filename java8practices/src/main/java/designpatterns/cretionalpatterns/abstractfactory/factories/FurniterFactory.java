package designpatterns.cretionalpatterns.abstractfactory.factories;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;


public interface FurniterFactory{
    Sofa createSofa();
    Chair createChair();

}

