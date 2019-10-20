package Algorithm;

public class Pacakage {
    //01背包
    //背包容量6
    public static void main(String[] args) {
        int[] w = new int[]{2, 3, 4};
        int[] v = new int[]{1, 2, 5};
        int[] dp = new int[7];
        for(int i=0;i<=2;i++)
        {
            for(int j=6;j>=w[i];j--)
            {
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        System.out.println(dp[6]);
    }
}
