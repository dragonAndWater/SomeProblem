package designPatterns.builderDemo.Model;

import designPatterns.builderDemo.Impl.Burger;

import java.math.BigDecimal;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(15.00);
    }
}
