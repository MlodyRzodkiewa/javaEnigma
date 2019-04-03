import java.util.Scanner;


public class atbash
{
    public String atbashEncryption(String message)
    {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length()-1; i > -1; i--)
        {
            reverseAlphabet += alphabet.charAt(i);
        }

        message = message.toUpperCase();

        String encryptedText = "";
        for (int i = 0; i < message.length(); i++)
        {
            if(message.charAt(i) == (char)32)
            {
                encryptedText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < alphabet.length(); j++)
                {
                    if(message.charAt(i) == alphabet.charAt(j))
                    {
                        encryptedText += reverseAlphabet.charAt(j);
                        break;
                    }
                } // for
            } // else
        } // for

        return encryptedText;
    } // method


    public String atbashDecryption(String message)
    {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length()-1; i > -1; i--)
        {
            reverseAlphabet += alphabet.charAt(i);
        }
        
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

        return decryptedText;
    } // method

} // class