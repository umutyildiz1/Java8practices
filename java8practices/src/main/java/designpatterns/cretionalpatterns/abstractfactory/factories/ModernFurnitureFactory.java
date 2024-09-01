package designpatterns.cretionalpatterns.abstractfactory.factories;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;
import designpatterns.cretionalpatterns.abstractfactory.entity.concretes.chair.ModernChair;
import designpatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa.ModernSofa;

public class ModernFurnitureFactory implements FurniterFactory {


    public Sofa createSofa(){
        return new ModernSofa();
    }

    public Chair createChair(){
        return new ModernChair();
    }
}
