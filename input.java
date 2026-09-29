import java.math.BigInteger;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of number");
        int rr=sc.nextInt();
        System.out.println("Enter the value of number");
        int var=sc.nextInt();
        System.out.println(rr+var);
       
        
        BigInteger bg=sc.nextBigInteger();
        System.out.println("BigInteger:" + bg);

        System.out.println("Enter the value of flag");
        boolean flag=sc.nextBoolean();
        System.out.println("value:" +flag);

        System.out.println("Enter the value of long");
        long num=sc.nextLong();
        System.out.println("value:" +num);

        System.out.println("Enter the value of fl");
        float fl=sc.nextFloat();
        System.out.println("value:" +fl);
        

        sc.close();    
    }
}
