import java.util.Scanner;

public class BinCon {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("[1] Decimal to Binary \n"
                + "[2] Binary to Decimal");
        int ch = sn.nextInt();
        if (ch == 1) {
            long binaryNumber, decimalNumber = 0, j = 1, remainder;
            System.out.print("Input a binary number:");
            binaryNumber = sn.nextLong();
             while (binaryNumber != 0)  {
            remainder = binaryNumber% 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
             System.out.println ("Decimal Number:" + decimalNumber);
        }
        else if(ch==2) {
        System.out.println ("Enter the Decimal Number:");
        int n = sn.nextInt ();
        int br;
        int num = n; 
        String str = "";
        while (num> 0)
        {
            int rem = num% 2;
            str = rem + str;
            num = num / 2;
        }
        System.out.println ("The Binary number for " + n + "is:" + str);
        }
        System.out.println("Convert Again? \n"
                + "[1] Yes \n"
                + "[2] No");
        int on = sn.nextInt();
        if(on == 2){
           System.exit(0);
        }
        while(on == 1){
            System.out.println("[1] Decimal to Binary \n"
                + "[2] Binary to Decimal");
        int c = sn.nextInt();
        if (c==1) {
            long binaryNumber, decimalNumber = 0, j = 1, remainder;
            System.out.print("Input a binary number:");
            binaryNumber = sn.nextLong();
             while (binaryNumber != 0)  {
            remainder = binaryNumber% 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
             System.out.println ("Decimal Number:" + decimalNumber);
        }
        else if(c==2) {
        System.out.println ("Enter the Decimal Number:");
        int n = sn.nextInt ();
        int br;
        int num = n; 
        String str = "";
        while (num> 0)
        {
            int rem = num% 2;
            str = rem + str;
            num = num / 2;
        }
        System.out.println ("The Binary number for " + n + "is:" + str);
        }
        System.out.println("Convert Again? \n"
                + "[1] Yes \n"
                + "[2] No");
        on = sn.nextInt();
        if(on == 2){
           System.exit(0);
        }
        }
    }

}

