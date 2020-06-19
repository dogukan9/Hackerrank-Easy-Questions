
import java.util.Scanner;


public class Main {
    public static int divisibleSumPairs(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             if((arr[i]+arr[j])%k==0){
                 count++;
                         
             }   
            }
        }
     
        return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int k=scan.nextInt();
        for(int i=0;i<n;i++){
        ar[i]=scan.nextInt();
        }
        int res=divisibleSumPairs(ar,k);
        System.out.println(res);
        
    }
}
