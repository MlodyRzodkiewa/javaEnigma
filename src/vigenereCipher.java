public class vigenereCipher {
   public static String encrypt(String[] args) {
      String cipheredMessage = "";
      String message = args[2].toUpperCase();
      String key = args[3].toUpperCase();

      if (args[1].equals("-e")) {
         for (int i = 0, j = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter != (' ')) {
               cipheredMessage += (char) (((letter - 65) + (key.charAt(j) - 65)) % 26 + 65);
            } else {
               cipheredMessage += ' ';
            }
            j = ++j % key.length();
         }
         System.out.println("Encrypted message: " + cipheredMessage);
      } else if (args[1].equals("-d")) {
         for (int i = 0, j = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            if (letter != (' ')) {
               cipheredMessage += (char) ((letter - key.charAt(j) + 26) % 26 + 65);
            } else {
               cipheredMessage += ' ';
            }
            j = ++j % key.length();
         }
         System.out.println("Decrypted message: " + cipheredMessage);
      }
      return "Error";
   }
}