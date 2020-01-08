package designPatterns.builderDemo.Model;

import designPatterns.builderDemo.Impl.Burger;

import java.math.BigDecimal;

public class CheckinBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(25.50);
    }
}
