package DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;

import static DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType.VICTORIAN;

public class VictorianSofa extends Sofa {
    public VictorianSofa() {
        super(VICTORIAN.getDescription());
    }
}
