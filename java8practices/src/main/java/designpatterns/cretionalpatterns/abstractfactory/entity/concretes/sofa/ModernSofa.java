package designpatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;

import static designpatterns.cretionalpatterns.abstractfactory.constants.ProductType.MODERN;

public class ModernSofa extends Sofa {
    public ModernSofa() {
        super(MODERN.getDescription());
    }
}
