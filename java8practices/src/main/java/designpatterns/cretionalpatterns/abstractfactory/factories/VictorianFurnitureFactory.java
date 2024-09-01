package designpatterns.cretionalpatterns.abstractfactory.factories;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;
import designpatterns.cretionalpatterns.abstractfactory.entity.concretes.chair.VictorianChair;
import designpatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurniterFactory {

    public Sofa createSofa() {
        return new VictorianSofa();
    }

    public Chair createChair() {
        return new VictorianChair();
    }
}
