package designpatterns.cretionalpatterns.abstractfactory.entity.concretes.chair;

import designpatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;

import static designpatterns.cretionalpatterns.abstractfactory.constants.ProductType.VICTORIAN;

public class VictorianChair extends Chair {

    public VictorianChair() {
        super(VICTORIAN.getDescription());
    }

}
