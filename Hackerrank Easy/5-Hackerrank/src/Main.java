
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
    public static String solve(int year) 
    {if (year == 1918){
        return "6.09.1918";
    }
    else if(((year <= 1917) && (year%4 == 0)) || ((year%400 == 0) || ((year%4 ==0) && (year%100 != 0)))){
      return "12.09."+year;
    }
     
    else{
        return "13.09."+year;
        
    }
     
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        
        System.out.println(solve(n));
    }
    
}
