package designPatterns.builderDemo.Impl;

import designPatterns.builderDemo.Interface.Item;
import designPatterns.builderDemo.Interface.Packing;

import java.math.BigDecimal;

public abstract class Burger implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();
}
