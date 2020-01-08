package designPatterns.builderDemo.Model;

import designPatterns.builderDemo.Interface.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal  {
    private List<Item> list = new ArrayList<Item>();

    public void addItem(Item item){
        list.add(item);
    }

    public String showItems(){
        StringBuilder strBuilder = new StringBuilder("");
        for(Item item:list){
            strBuilder.append(item.name()).append("-").append(item.packing().pack())
                    .append("-").append(item.price()).append("\n");
        }
        return strBuilder.toString();
    }
    public BigDecimal getSumCost(){
        BigDecimal sumCost = new BigDecimal(0.00);
        for (Item item:list){
            sumCost.add(item.price());
        }
        return sumCost;

    }
}
