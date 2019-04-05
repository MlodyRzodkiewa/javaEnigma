public class caesarCipher {
   public static String encrypt(String[] args) {
      String cipheredMessage = "";
      String message = args[2].toLowerCase();
      int shift = Integer.parseInt(args[3]);

      if (args[1].equals("-e")) {
         for (int x = 0; x < message.length(); x++) {
            char ch = (char) (message.charAt(x) + shift);
            if (ch > 'z')
               cipheredMessage += (char) (message.charAt(x) - (26 - shift));
            else
               cipheredMessage += (char) (message.charAt(x) + shift);
         }
         System.out.println("Encrypted message: " + cipheredMessage);
      } else if (args[1].equals("-d")) {
         for (int x = 0; x < message.length(); x++) {
            char ch = (char) (message.charAt(x) - shift);
            if (ch < 'a')
               cipheredMessage += (char) (message.charAt(x) + (26 - shift));
            else
               cipheredMessage += (char) (message.charAt(x) - shift);
         }
         System.out.println("Decrypted message: " + cipheredMessage);
      }
      return "Error";
   }
}
