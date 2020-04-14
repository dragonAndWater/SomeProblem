package LeetCode;
//给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
//
//你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
//
//返回获得利润的最大值
public class 股票买卖 {

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        System.out.println("总共盈利"+maxProfit(prices,2));
    }

    public static int maxProfit(int[] prices, int fee) {
        int money = 0;
        for(int i = 0;i < prices.length ; i++){
            for(int k = i+1;k<prices.length;k++){
                int sub_mon = prices[k]-prices[i]-2;
                if( sub_mon>0){
                    System.out.println("买入金额为:"+prices[i]+",卖出金额为"+prices[k]+"此时可以交易，交易获利为："+sub_mon);
                    money += sub_mon;
                    if(k+1 <prices.length)
                        i = k++;
                    continue;
                }
            }
        }
        return money;
    }

}
