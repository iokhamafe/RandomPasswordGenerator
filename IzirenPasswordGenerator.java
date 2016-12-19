import java.util.Scanner;
public class IzirenPasswordGenerator {
    public static void main(String[] args) {
        String randomCharacters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ~!@#$%^&*()_+/";
        int numCharsPwd;
        System.out.println("Please enter how many characters you would like to create your password");
        Scanner input = new Scanner(System.in);
        numCharsPwd = input.nextInt();
        char[] generatedPwd = new char[numCharsPwd];
        
        for (int i = 0; i < numCharsPwd; i++) {
            generatedPwd[i] = randomCharacters.charAt((int)(Math.random() * randomCharacters.length()));
        }
        String passString = String.valueOf(generatedPwd);
        System.out.println("Password generated: " + passString);
    }
}
