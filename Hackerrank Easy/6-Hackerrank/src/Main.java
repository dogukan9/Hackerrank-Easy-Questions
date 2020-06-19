
import java.util.Scanner;

public class Main {
    
   static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
		int max = -1;

		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= budget && keyboards[i] + drives[j] > max)
					max = keyboards[i] + drives[j];
			}
		}
		return max;
	}
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int budget=scan.nextInt();
        int n=scan.nextInt();
         int m=scan.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[m];
        for (int i = 0; i <n; i++) {
           arr[i]=scan.nextInt();
        }
        for (int j = 0; j < m; j++) {
          arr2[j]=scan.nextInt();   
        }
        int r=getMoneySpent(arr,arr2,budget);
        
        System.out.println(r);
    }
    
    
}
