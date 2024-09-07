package DesignPatterns.cretionalpatterns.abstractfactory.entity.concretes.chair;

import DesignPatterns.cretionalpatterns.abstractfactory.entity.abstracts.Chair;

import static DesignPatterns.cretionalpatterns.abstractfactory.constants.ProductType.MODERN;

public class ModernChair extends Chair {
    public ModernChair() {
        super(MODERN.getDescription());
    }
}
