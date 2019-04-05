
public class Enigma {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equals("-l")) {
                System.out.println("Available ciphers: \nRot13\nAtbash\nCaesar\nBaconian\nVignere\nMorse");
            }
            if (!args[0].equals("-l")) {
                // there we can add another ciphers
                if (args[0].equals("Rot13") && (args[1].equals("-d") || args[1].equals("-e"))) {
                    Rot13 decrypt = new Rot13();
                    if (args[1].equals("-e")) {
                        System.out.println("Encrypted message: ");
                    } else if (args[1].equals("-d")) {
                        System.out.println("Decrypted message: ");
                    }
                    decrypt.decrypt(args);
                } else if (args[0].equals("Atbash")) {
                    atbash Atbash = new atbash();
                    if (args[1].equals("-e")) {
                        Atbash.atbashEncryption(args[2]);
                    }
                    if (args[1].equals("-d")) {
                        Atbash.atbashDecryption(args[2]);
                    }
                } else if (args[0].equals("Baconian")) {
                    baconian Bacon = new baconian();
                    if (args[1].equals("-e")) {
                        Bacon.baconianEncryption(args[2]);
                    }
                    if (args[1].equals("-d")) {
                        Bacon.baconianDecryption(args[2]);
                    }
                } else if (args[0].equals("Caesar")) {
                    caesarCipher caesar = new caesarCipher();
                    caesar.encrypt(args);
                } else if (args[0].equals("Vigenere")) {
                    vigenereCipher vigenere = new vigenereCipher();
                    vigenere.encrypt(args);
                } else if (args[0].equals("Morse")) {
                    Morse morseCipher = new Morse();
                    if (args[1].equals("-e")) {
                        morseCipher.encrypt(args);
                    }
                    if (args[1].equals("-d")) {
                        morseCipher.decrypt(args);
                    }

                } else {
                    System.out.println("No cipher in database!");
                }

            } else {
                System.out.println("Enter text to encypt or decrypt!");
            }
        } else {
            System.out.println("Enter a cipher name!");
            System.out.println("Type -l to show available ciphers!");
        }

    }

}
