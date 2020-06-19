
import java.util.Scanner;


public class Main {
    /*public static int gonder(int [] ar){
          
          int count2=0;
        for (int i =0; i <ar.length-2;i++) {
            
            
            if(ar[i+2]==0){
                count2++;
                i+=1;
                
            }
            else if(ar[i+1]==0){
                count2++;
               
            }
             
            
        }
            
       
               
            
             
            
        
        return count2;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=scan.nextInt();
        }
        int print=gonder(ar);
        System.out.println(print);
    }*/
    public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);

    int n=scan.nextInt();
    int arr[]=new int [n];
    int jump=0;

    for (int i=0;i<n;i++)
    {   
        arr[i]=scan.nextInt();      
    }
    for (int i=0;i<n-2;i++)
    {
        if ( arr[i+1]==0 && arr[i+2]==0 && i<n-1  )
        {
            jump++;
            i++;
            continue;
        }
        else if (arr[i+1]==0 && arr[i+2]==1  && i<n-1)
        {
            jump++;

        }
        else if (arr[i+1]==1 && arr[i+2]==0  && i<n-1 )
        {
            jump++;
            i++;
            continue;
        }


    }
    if (arr[n-1]==0 && arr[n-2]==0)
    {
        jump++;

    }

    System.out.println(jump);




}
}
