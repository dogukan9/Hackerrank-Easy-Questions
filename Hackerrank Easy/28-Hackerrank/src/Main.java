import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       String[] arr=new String[n];
         for(int i=0;i<n;i++){
            arr[i]=scan.next();    
        }
        for(int i=0;i<n;i++){
           int num=Integer.valueOf(arr[i]);
            if(num<38){
                System.out.println(arr[i]);
  }
            else if(38<num & num<40){
                 System.out.println(40);
            }
            else if(arr[i].endsWith("8")){
                arr[i]=String.valueOf(num+2);
                System.out.println(arr[i]);
            }
             else if(arr[i].endsWith("4")){
                arr[i]=String.valueOf(num+1);
                System.out.println(arr[i]);
            }
             else if(arr[i].endsWith("3")){
                arr[i]=String.valueOf(num+2);
                System.out.println(arr[i]);
            }
             else if(arr[i].endsWith("9")){
                arr[i]=String.valueOf(num+1);
                System.out.println(arr[i]);
            }
             else{  
                 System.out.println(num);    
             }        }     }  }
