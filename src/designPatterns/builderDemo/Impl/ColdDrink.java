package designPatterns.builderDemo.Impl;

import designPatterns.builderDemo.Interface.Item;
import designPatterns.builderDemo.Interface.Packing;

import java.math.BigDecimal;

public abstract class ColdDrink implements Item {
//    @Override
//    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract BigDecimal price();
//        return new BigDecimal(10.50);

}
