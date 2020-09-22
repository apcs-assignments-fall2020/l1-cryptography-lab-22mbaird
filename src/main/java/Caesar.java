import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String str1="";
        
        for (int i = 0; i<message.length(); i++){
            char cif = message.charAt(i);
            if(97<=cif && cif<=119){
                cif=(char)((cif+3));

            }
            else if(cif>=120 && cif<=122){
                cif=(char)((cif-23));
            }

            str1=str1+cif;
       }
        return str1;
    }

    public static String decryptCaesar(String message) {
        String str1="";
        
        for (int i = 0; i<message.length(); i++){
            char cif = message.charAt(i);
            if(100<=cif && cif<=122){
                cif=(char)((cif-3));

            }
            else if(cif>=97 && cif<=99){
                cif=(char)((cif+23));
            }
            
            str1=str1+cif;
       }
        return str1;
        
    }

    public static String encryptCaesarKey(String message, int key) {
        String str1="";
        
        for (int i = 0; i<message.length(); i++){
            char cif = message.charAt(i);
            if(97<=cif && cif<=(122-key)){
                cif=(char)((cif+3));

            }
            else if(cif>=(122-key) && cif<=122){
                cif=(char)((cif-23));
            }

            str1=str1+cif;
       }
        return str1;

        
    }

    public static String decryptCaesarKey(String message, int key) {
        String str1="";
        
        for (int i = 0; i<message.length(); i++){
            char cif = message.charAt(i);
            if((97+key)<=cif && cif<=122){
                cif=(char)((cif-3));

            }
            else if(cif>=97 && cif<=(97+key)){
                cif=(char)((cif+25-key));
            }
            
            str1=str1+cif;
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
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }
        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command1 = scan.nextLine().trim().toLowerCase();

        if (command1.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Key: ");
            int key = scan.nextInt();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesarKey(message, key));
        }
        else if (command1.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Key: ");
            int key = scan.nextInt();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesarKey(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");

        scan.close();
    }
}
}
