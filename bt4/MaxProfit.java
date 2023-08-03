package bt4;


public class MaxProfit {

    public static Integer solution(int[] prices){


            // Code sinh vien
        int minPrice = prices[0];
        int maxPro = 0;
        for(int j=0; j< prices.length-1; j++){
            if(minPrice>=prices[j]){
                minPrice = prices[j];
                for(int k = j+1; k<prices.length;k++){
                    int tmp =  prices[k]-minPrice;
                    if(tmp > maxPro){
                        maxPro = tmp;
                    }
                }
            }
        }
        return maxPro;

            // Code master
        // int lsf = Integer.MAX_VALUE;
        // int op = 0;
        // int pist = 0;
        
        // for(int i = 0; i < prices.length; i++){
        //     if(prices[i] < lsf){
        //         lsf = prices[i];
        //     }
        //     pist = prices[i] - lsf;
        //     if(op < pist){
        //         op = pist;
        //     }
        // }
        // return op;
    }
    public static void main(String[] args) {
        int[] numbers = {7,6,2,5};
        System.out.println(solution(numbers));;
    }
}
