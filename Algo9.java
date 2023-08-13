import java.util.Scanner;

public class Algo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        do{
            System.out.print("Enter your text: ");
            str  = scanner.nextLine().strip();
            if (str.contains(" "))System.out.println("Please enter only one word!!");

        }while(str.contains(" ") || str.isBlank());

        char [] chars = str.toCharArray();
        int j = str.length()-1;
        loop:{
        for (int i = 0; i < str.length(); i++) {

            if (chars[i]!= chars[j]){
                System.out.println("This is not a palindrome!!");
                break loop;

            }j--;
           
        }
        System.out.println("This is a palindrome......");
    }
    }
    
}
