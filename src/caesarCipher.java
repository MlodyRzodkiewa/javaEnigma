public class caesarCipher
{
   public static String encrypt(String[] args)
   {
      String msg = args[2];
      int shift = Integer.parseInt(args[3]);
      String shiftedWord = "";
      if (args[0].equals("-e"))
      {
         for(int x = 0; x < msg.length(); x++)
         {
            char ch = (char)(msg.charAt(x) + shift);
            if (ch > 'z')
               shiftedWord += (char)(msg.charAt(x) - (26 - shift));
            else
               shiftedWord += (char)(msg.charAt(x) + shift);
         }
         return shiftedWord;
      }  
         else if (args[0].equals("-d"))
      {
         for(int x = 0; x < msg.length(); x++)
         {
            char ch = (char)(msg.charAt(x) - shift);
            if (ch < 'a')
               shiftedWord += (char)(msg.charAt(x) + (26 - shift));
            else
               shiftedWord += (char)(msg.charAt(x) - shift);
         }
         return shiftedWord;
      }
      return "Error";
   }
}



