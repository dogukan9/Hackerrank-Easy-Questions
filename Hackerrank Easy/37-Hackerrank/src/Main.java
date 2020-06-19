
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] hours={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
        "seventeen","eighteen","nineteen"};
        String[] minutes={"","ten","twenty","thirty","fourty","fifty"};

        int hour=scan.nextInt();
        int minute=scan.nextInt();
             
        String saat=hours[hour];
        int rem=minute%10;
        int rem2=minute/10;
        String dakika=minutes[rem2]+" "+hours[rem];
        
        if(minute<30){
            
            if(minute==00){
                 System.out.println(saat+" o' clock");
            }
             else if(minute<10){
                   System.out.println(hours[minute]+" minute past "+saat);
            }
           
           
           else if(minute==15){
                 System.out.println("quarter past "+saat);
            }
            else if(minute<20){
                   System.out.println(hours[minute]+" minutes past "+saat);
            }
            else{
                System.out.println(dakika+" minutes past "+saat);
            }
        }
        
        else{
           
              int kalan=60-minute;
              rem2=kalan%10;
              rem=kalan/10;
              dakika=minutes[rem]+" "+hours[rem2];
           if(minute==30){
                 System.out.println("half past "+saat);
            }
            else if(minute<=40){
                System.out.println(dakika+" minutes to "+hours[hour+1]);
           }
            
           else if(minute==45){
               System.out.println("quarter to "+hours[hour+1]);
           }
           
         
            else{
                System.out.println(hours[60-minute]+" minutes to "+hours[hour+1]);
            }
        }
        }
        
      
    }
    

