package designPatterns.builderDemo.Impl;

import designPatterns.builderDemo.Interface.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "纸盒";
    }
}
