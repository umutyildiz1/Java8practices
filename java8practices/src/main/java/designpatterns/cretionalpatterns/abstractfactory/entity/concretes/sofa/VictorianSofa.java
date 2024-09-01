package designpatterns.cretionalpatterns.abstractfactory.entity.concretes.sofa;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Sofa;

import static designpatterns.cretionalpatterns.abstractfactory.constants.ProductType.VICTORIAN;

public class VictorianSofa extends Sofa {
    public VictorianSofa() {
        super(VICTORIAN.getDescription());
    }
}
