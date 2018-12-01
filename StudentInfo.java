import java.io.*;

public class StudentInfo {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("How old are you?");
        String age = br.readLine();
        System.out.println("What is your gender?");
        String gender = br.readLine();
        System.out.println("What is the value of PI?");
        String pi = br.readLine();
        
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gender is " + gender);
        System.out.println("The value of PI is " + pi);
    }
    
}

Attachments area
