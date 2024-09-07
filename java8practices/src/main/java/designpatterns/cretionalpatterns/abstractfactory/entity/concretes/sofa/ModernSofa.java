package DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;

import static DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType.MODERN;

public class ModernSofa extends Sofa {
    public ModernSofa() {
        super(MODERN.getDescription());
    }
}
