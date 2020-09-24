import java.util.Scanner;

public class Vigenere {
    public static String encryptVigenere(String message, int key) {
        String str1="";
        String stc ="";
        
        for (int i = 0; i<message.length(); i++){
            char cif = message.charAt(i);
            if(97<=cif && cif<=122){
                int c=(int)(cif-97);
                stc = String.valueOf(c);
            }
            else {
                break;
            }

            
            
            
            str1=str1+stc;
       }
        return str1;
    }

    public static String decryptVigenere(String message, int key) {
        String str1="";
        String stc ="";
        
        for (int i = 0; i<message.length(); i++){
            int ci = message.charAt(i);
            if(0<=ci && ci<=25){
                int c=(int)(ci+97);
                stc = String.valueOf(c);
            }
            else{
                break;
            }
            
            
            str1=str1+stc;
       }
        return str1;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            Integer key = scan.nextInt();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            Integer key = scan.nextInt();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
