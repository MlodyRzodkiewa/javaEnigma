
public class baconian {
    public void baconianEncryption(String message) {
        message = message.toLowerCase();

        String messageEncrypted = message.replaceAll(" ", "b").replaceAll("[aA]", "aaaaa").replaceAll("[bB]", "aaaab").replaceAll("[cC]", "aaaba")
                .replaceAll("[dD]", "aaabb").replaceAll("[eE]", "aabaa").replaceAll("[fF]", "aabab").replaceAll("[gG]", "aabba")
                .replaceAll("[hH]", "aabbb").replaceAll("[iI]", "abaaa").replaceAll("[jJ]", "abaab").replaceAll("[kK]", "ababa")
                .replaceAll("[lL]", "ababb").replaceAll("[mM]", "abbaa").replaceAll("[nN]", "abbab").replaceAll("[oO]", "abbba")
                .replaceAll("[pP]", "abbbb").replaceAll("[rR]", "baaab").replaceAll("[sS]", "baaba").replaceAll("[tT]", "baabb")
                .replaceAll("[uU]", "babaa").replaceAll("[wW]", "babba").replaceAll("[yY]", "bbaaa").replaceAll("[zZ]", "bbaab");

        System.out.println("Encrypted message: " + messageEncrypted);
    }

    public void baconianDecryption(String messageEncrypted) {
        messageEncrypted = messageEncrypted.toLowerCase();

        int start = 0;
        int stop = 5;
        String charEcrypt;
        String output = "";

        for (int i = 0; i < messageEncrypted.length() / 5; i++) {
            charEcrypt = messageEncrypted.substring(start, stop);
            output += charEcrypt.replaceAll("aaaab", " ").replaceAll("aaaaa", "a").replaceAll("aaaab", "b").replaceAll("aaaba", "c")
                    .replaceAll("aaabb", "d").replaceAll("aabaa", "e").replaceAll("aabab", "f").replaceAll("aabba", "g")
                    .replaceAll("aabbb", "h").replaceAll("abaaa", "i").replaceAll("abaab", "j").replaceAll("ababa", "k")
                    .replaceAll("ababb", "l").replaceAll("abbaa", "m").replaceAll("abbab", "n").replaceAll("abbba", "o")
                    .replaceAll("abbbb", "p").replaceAll("baaab", "r").replaceAll("baaba", "s").replaceAll("baabb", "t");
            start += 5;
            stop += 5;
        }
        System.out.println(" Decrypted message: " + output);
    }//method
}//class