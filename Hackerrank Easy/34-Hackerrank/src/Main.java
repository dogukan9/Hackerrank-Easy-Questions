import java.util.Scanner;
public class Main {
    public static void topla(int num){
       int temp=num;
        int rem=0;
       int rev=0;
       int count=0;
       int son=0;
      int kare=num*num;
        int digit=0;
         while (temp>0) {
             digit++;
            temp=temp/10;
        }
         int bas=digit;
        while(kare>0){
                rem=kare%10;
                rev=(int)Math.pow(10,count)*rem;
               bas=bas-1;
                 count++;
                if(bas==0){
                    bas=digit;
                    count=0;
                }
                 son+=rev;
                    kare=kare/10;
           }
       if(son==num){
            System.out.print(num+" ");
         }
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
       for(int i=n;i<=m;i++){
           topla(i);
       }
    }
}
/*



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        scan.close();
        
        boolean foundKaprekar = false;
        for (int num = p; num <= q; num++) {
            if (isKaprekar(num)) {
                foundKaprekar = true;
            }
        }
        if (!foundKaprekar) {
            System.out.println("INVALID RANGE");
        }
    }
    
    private static boolean isKaprekar(int num) {
        long squared = (long) num * num;
        String str   = String.valueOf(squared);
        String left  = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        if (numL + numR == num) {
            System.out.print(num + " ");
            return true;
        } else {
            return false;
        }
    }
}
*/