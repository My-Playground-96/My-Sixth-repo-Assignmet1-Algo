import java.util.Scanner;

public class Algo7 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        
        String text;
        
        do{

            System.out.print("Enter yoor text: ");
            text = scanner.nextLine().strip();
            if (text.isBlank()) System.out.println("Invalid text, you can't enter empty string!");

        }while(text.isBlank());
        char [] char1 = text.toCharArray();
        String str = "";
        String shortest = "";
        String longest = "";
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            
            if (char1[i] != ' '){
                str += char1[i];

            }
            if(char1[i] == ' ' || i == char1.length-1){
                k++;
                loop:{
                if (k==1) {
                    shortest = str;
                    System.out.println(shortest);
                    break loop;   
                }
                }
                if (str.length() < shortest.length()){
                    shortest = str;
                }
                if (str.length() > longest.length()){
                    longest = str;
                }
                str = "";
            }

        }
        System.out.println("Shortest word is: "+shortest);
        System.out.println("Longest word is: "+longest);

    }
    
}
