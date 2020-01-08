package designPatterns.builderDemo.Interface;

import java.math.BigDecimal;
/**
 * @Author longtao
 * @Date   2020/1/8
 * @Describe 接口的特性：
 *            1：接口全是抽象方法
 *            2: 实现类可以同时impl多个接口
 *            3：抽象方法只能是public
 *            4: 变量默认都是final
 **/
public interface Item {
    Integer custom_id = 100;
    String name();
    Packing packing();
    BigDecimal price();
}
