
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void result(String word,String let2,int k){
        ArrayList<Character> al=new ArrayList<Character>();
      int c=0;
      String copy="";
        for (char i ='a'; i <='z'; i++) {
          al.add(i);
        }
        
        int s;
        String ss;
        
        for (int i = 0; i <word.length(); i++) {
            s=(int)word.charAt(i);
           if(word.charAt(i)=='-'){
               copy+='-';
           }
           
           else{
               int index=al.indexOf(let2.charAt(i))+k;
               if(index>26){
                   index=index-26;
               }
              ss=al.get(index).toString();
               if(s<97){
                 copy+=ss.toUpperCase();
               }
               else{
                   copy+=ss;
               }
               
           }
            
            
        }
        System.out.println(copy);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
       String let=scan.next();
       String let2=let.toLowerCase();
       int k=scan.nextInt()%26;
        result(let,let2, k);
       
    }
}
