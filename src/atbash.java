import java.util.Scanner;


public class atbash
{
    private static Scanner in;
    public static void main(String[] args) 
    {
        in = new Scanner(System.in);
        System.out.print("1. Encr\n2. Decr");  
        int choice = in.nextInt();
        in.nextLine();

        if(choice == 1)
        {
            System.out.println("Encryption");
            atbashEncryption();
        } else if(choice == 2)
        {
            System.out.println("Decryption");
            atbashDecryption();
        }
    }

    private static void atbashEncryption()
    {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length()-1; i > -1; i--)
        {
            reverseAlphabet += alphabet.charAt(i);
        }

        System.out.println("Enter message: ");
        String message = in.nextLine();
        in.nextLine();

        message = message.toUpperCase();

        String decryptedText = "";
        for (int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) == (char)32)
            {
                decryptedText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < alphabet.length(); j++)
                {
                    if(message.charAt(i) == alphabet.charAt(j))
                    {
                        decryptedText += reverseAlphabet.charAt(j);
                        break;
                    }
                } // for
            } // else
        } // for

        System.out.println("Encrypted message: " + decryptedText);
    } // method


    private static void atbashDecryption()
    {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length()-1; i > -1; i--)
        {
            reverseAlphabet += alphabet.charAt(i);
        }

        System.out.println("Enter encrypted message: ");
        String message = in.nextLine();
        in.nextLine();
        
        message = message.toUpperCase();

        String decryptedText = "";
        for (int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) == (char)32)
            {
                decryptedText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < reverseAlphabet.length(); j++)
                {
                    if(message.charAt(i) == reverseAlphabet.charAt(j))
                    {
                        decryptedText += alphabet.charAt(j);
                        break;
                    }
                } // for
            } // else
        } // for

        System.out.println("Decrypted message: " + decryptedText);
    } // method

} // class