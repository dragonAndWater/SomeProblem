package designPatterns.builderDemo.Impl;

import designPatterns.builderDemo.Interface.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶子";
    }
}
