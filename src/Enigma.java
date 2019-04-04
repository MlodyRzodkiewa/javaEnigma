
public class Enigma 
{
    public static void main(String[] args) 
    {
        for (int i = 0; i < args.length; i++) 
        {
            System.out.print(args[i]);
        }
        if (args.length > 0) 
        {
            if (args.length > 2) 
            {
                // there we can add another ciphers
                if (args[0].equals("Rot13") && (args[1].equals("-d") || args[1].equals("-e"))) 
                {
                    Rot13 decrypt = new Rot13();
                    decrypt.decrypt(args);
                } else if (args[0].equals("Atbash")) 
                {
                    atbash Atbash = new atbash();
                    if (args[1].equals("-e")) 
                    {
                        Atbash.atbashEncryption(args[2]);
                    }
                    if (args[1].equals("-d")) 
                    {
                        Atbash.atbashDecryption(args[2]);
                    }
                } else if (args[0].equals("Baconian")) 
                {
                    baconian Bacon = new baconian();
                    if (args[1].equals("-e")) 
                    {
                        Bacon.baconianEncryption(args[2]);
                    }
                    if (args[1].equals("-d")) 
                    {
                        Bacon.baconianDecryption(args[2]);
                    }    
                } else if (args[0].equals("caesar")) 
                {
                    caesarCipher caesar = new caesarCipher();
                    caesar.encrypt(args);
                } else if (args[0].equals("vigenere")) 
                    {
                    vigenereCipher vigenere = new vigenereCipher();
                    vigenere.encrypt(args);
                    } else 
                    {
                        System.out.println("No cipher in database!");
                    }
                } else 
                {
                    System.out.println("Enter text to encypt or decrypt!");
                }
            } else 
            {
                System.out.println("Enter a cipher name!");
                System.out.println("Type -l to show available ciphers!");
            }

        }

    }
