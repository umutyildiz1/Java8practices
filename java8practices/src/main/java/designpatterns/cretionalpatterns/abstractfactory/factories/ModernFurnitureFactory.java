package DesignPatterns.cretionalpatterns.abstractfactory.factories;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.chair.ModernChair;
import DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa.ModernSofa;

public class ModernFurnitureFactory implements FurniterFactory {


    public Sofa createSofa(){
        return new ModernSofa();
    }

    public Chair createChair(){
        return new ModernChair();
    }
}
