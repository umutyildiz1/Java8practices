package designpatterns.cretionalpatterns.abstractfactory.entity.concretes.chair;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;

import static designpatterns.cretionalpatterns.abstractfactory.constants.ProductType.MODERN;

public class ModernChair extends Chair {
    public ModernChair() {
        super(MODERN.getDescription());
    }
}
