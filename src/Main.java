class main {
    public static void main(String[] args) {


        int n = 3;
        int k = 2;
        int relation[][] = {{0, 2}, {2, 1}};
        int count = 0;
        //根据K来定循环次数
        for (int i = 0; i < relation.length; i++) {
            if (relation[i][1] == n - 1) {
                System.out.println("relation[" + i + "][" + 1+"]"  );
               count = getRet(relation, count, n - 1, 1,i,k);
            }
        }
        System.out.println("count :" + count);
    }

    public static int getRet(int[][] relation, int count, int result, int k,int q,int k_value) {
//        System.out.println("q = "+q);
        for (int i = q; i < relation.length; i++) {
            int num = relation[i][1];
            int num_2 = relation[i][0];
            if (num == result) {//判断当前后位是否等于上个前位
//                System.out.println("对应的值是：" + num_2 + "," + result+",relation[" + i + "]，当前k = "+k);
                if (k == k_value ) {
                    if(num_2 == 0){
                        ++count;
                    }
                     break;
                }else{
                    ++k;
                    return getRet(relation, count, num_2, k,0,k_value);
                }
            }
        }
//        System.out.println("当前count = "+count);
        return count;
    }


}