import java.util.Scanner;

public class atbash {
    public void atbashEncryption(String message) {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length() - 1; i > -1; i--) {
            reverseAlphabet += alphabet.charAt(i);
        }

        message = message.toUpperCase();

        String encryptedText = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == (char) 32) {
                encryptedText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < alphabet.length(); j++) {
                    if (message.charAt(i) == alphabet.charAt(j)) {
                        encryptedText += reverseAlphabet.charAt(j);
                        break;
                    }
                } // for
            } // else
        } // for
        System.out.println(" Encrypted message: " + encryptedText);
    } // method

    public void atbashDecryption(String message) {
        String alphabet = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String reverseAlphabet = "";

        for (int i = alphabet.length() - 1; i > -1; i--) {
            reverseAlphabet += alphabet.charAt(i);
        }
        message = message.toUpperCase(); // ! nie działa.

        String decryptedText = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == (char) 32) {
                decryptedText += " ";
            } else {
                int count = 0;
                for (int j = 0; j < reverseAlphabet.length(); j++) {
                    if (message.charAt(i) == reverseAlphabet.charAt(j)) {
                        decryptedText += alphabet.charAt(j);
                        break;
                    }
                } // for
            } // else
        } // for
        System.out.println(" Decrypted message: " + decryptedText);
    } // method
} // class