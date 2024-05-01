import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int pos = 0;
            while(pos<i+1){
             System.out.print('*');
            pos++;
            }
            System.out.println();
        }

        // System.out.println(n);
    }
}