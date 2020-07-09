package june20;

import java.util.Scanner;

/*
https://www.codechef.com/JUNE20B/problems/EVENM
 */
public class EvenMatrix {
    static void buildMatrix(StringBuilder mat,int n)
    {
        if(n%2==0)
        {
            int k=1;
            for (int i = 0; i < n; i++) {
                if(i%2!=0) {
                    mat.append((k+n-1) + " ");
                    for (int j = 1; j < n; j++) {
                        mat.append(k++ + " ");
                    }
                    k++;
                }
                else {
                    for (int j = 0; j < n; j++) {
                        mat.append(k++ + " ");
                    }
                }
                mat.append("\n");
            }
        }
        else{
            int k=1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat.append(k+++" ");
                }
                mat.append("\n");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        while (t-->0){
            int n=sc.nextInt();
            buildMatrix(ans,n);
        }
        System.out.print(ans);
    }
}
