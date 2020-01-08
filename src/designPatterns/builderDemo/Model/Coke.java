package designPatterns.builderDemo.Model;

import designPatterns.builderDemo.Impl.ColdDrink;

import java.math.BigDecimal;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(4.50);
    }
}
