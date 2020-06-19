
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doğukan
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();
        
        int count=0;
       
        for(int a=i;a<=j;a++){
          int reverse=0;
         int temp=a;
         
        while(temp!=0){
              reverse = reverse * 10;
        reverse = reverse + temp%10;
           temp=temp/10;
           
         } 
        
        if((Math.abs(a-reverse)%k==0)){
            count++;
        }
     
       
            
        }
       System.out.println(count);
         
        }
    
}
