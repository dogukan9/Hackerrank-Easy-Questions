
import java.util.Scanner;

public class Main {
   
static void pickingNumbers(int[] a) {
 int[] b=new int[200];
  for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            int k= 2*i;
            if(a[i]==a[j]||a[i]==a[j]+1)
                b[k]++;
            if(a[i]==a[j]||a[i]==a[j]-1)
                b[k+1]++;
        }
    }
 
   
    for(int i=0;i<b.length;i++){
         if(b[i]>b[0])
            b[0]=b[i];
        
    }
   System.out.println(b[0]);
       
   
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr =new int[n];
     for (int i = 0; i <n; i++) {
        arr[i]=scan.nextInt();
    }
   pickingNumbers(arr);
   
}
 
}

