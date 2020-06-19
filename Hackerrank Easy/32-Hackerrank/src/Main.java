
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
     static int[] acmTeam(String[] topic) {

            int n = topic.length;
            BigInteger[] bi = new BigInteger[n];

            for (int i = 0; i < n; i++)
                bi[i] = new BigInteger(topic[i], 2);

            int maxTopic = 0;
            int teamCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    BigInteger iuj = bi[i].or(bi[j]);
                    int bitCount = iuj.bitCount();
                    if (bitCount > maxTopic) {
                        maxTopic = bitCount;
                        teamCount = 1;
                    } else if (bitCount == maxTopic) {
                        teamCount++;
                    }
                }
            }

            int result[] = { maxTopic, teamCount };
            return result;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int r=scan.nextInt();
        int c=scan.nextInt();
      String[] mat=new String[r];
        
        for (int i = 0; i <r; i++) {
        
                mat[i]=scan.next();
                
            
            
        }
       
     int[] re=acmTeam(mat);
        System.out.println(re[0]+"\n"+re[1]);
    }
           
}
