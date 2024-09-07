package DesignPatterns.cretionalpatterns.abstractfactory.factories;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.chair.VictorianChair;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurniterFactory {

    public Sofa createSofa() {
        return new VictorianSofa();
    }

    public Chair createChair() {
        return new VictorianChair();
    }
}
