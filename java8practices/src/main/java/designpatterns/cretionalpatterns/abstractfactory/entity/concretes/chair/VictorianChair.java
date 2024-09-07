package DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.chair;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;

import static DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType.VICTORIAN;

public class VictorianChair extends Chair {

    public VictorianChair() {
        super(VICTORIAN.getDescription());
    }

}
