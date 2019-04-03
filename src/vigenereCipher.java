
public class vigenereCipher
{
	
   public static String encrypt(String[] args) 
   {
		String cipheredMessage = "";
      String message = args[2].toUpperCase();
      String key = args[3].toUpperCase();
      if (args[1].equals("-e"))
      {
         for (int i = 0, j = 0; i < message.length(); i++) 
         {
            char letter = message.charAt(i);
            cipheredMessage += (char)(((letter - 65) + (key.charAt(j)-65)) % 26 + 65);
            j = ++j % key.length();
         }
         return cipheredMessage;
      }
      else if (args[0].equals("-d"))
      {
         for (int i = 0, j = 0; i < message.length(); i++) 
         {
            char letter = message.charAt(i);
            cipheredMessage += (char)((letter - key.charAt(j) + 26) % 26 + 65);
            j = ++j % key.length();
         }
         return cipheredMessage;
      }
   return "Error";
   }
}