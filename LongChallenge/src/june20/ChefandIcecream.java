package june20;

import java.util.Scanner;
/*
https://www.codechef.com/JUNE20B/problems/CHFICRM
 */
public class ChefandIcecream {
    static boolean func(int[] arr)
    {
        int five=0;
        int ten=0;
        for (int coin : arr) {
            if (coin == 5) {
                five++;
            } else if (coin == 10) {
                if (five > 0) {
                    ten++;
                    five--;
                } else
                    return false;
            } else if (coin == 15) {
                if (ten > 0) {
                    ten--;
                } else if (five > 1) {
                    five -= 2;
                } else
                    return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if(func(arr))
                ans.append("YES\n");
            else
                ans.append("NO\n");
        }
        System.out.print(ans);
    }
}
