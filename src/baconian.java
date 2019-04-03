
public class baconian
{
    public String baconianEncryption(String message)
    {
        /*String[] baconAlphabet = {"aaaaa", "aaaab", "aaaba", "aabbb", "abaaa", "abaab", "ababa", "ababb", "abbaa", "abbab", 
        "abbba", "babaa", "babba", "bbaaa", "bbaab"};*/
        message = message.toLowerCase();
        /* Działający kod ale za długi, replaceAll dla każdej litery
        trzeba przerobić na fora */
        String messageEncrypted = message.replaceAll("[aA]", "aaaaa").replaceAll("[bB]", "aaaab").replaceAll("[cC]", "aaaba")
        .replaceAll("[dD]", "aaabb").replaceAll("[eE]", "aabaa").replaceAll("[fF]", "aabab").replaceAll("[gG]", "aabba")
        .replaceAll("[hH]", "aabbb").replaceAll("[iI]", "abaaa").replaceAll("[jJ]", "abaab").replaceAll("[kK]", "ababa")
        .replaceAll("[lL]", "ababb").replaceAll("[mM]", "abbaa").replaceAll("[nN]", "abbab").replaceAll("[oO]", "abbba")
        .replaceAll("[pP]", "abbbb").replaceAll("[rR]", "baaab").replaceAll("[sS]", "baaba").replaceAll("[tT]", "baabb")
        .replaceAll("[uU]", "babaa").replaceAll("[wW]", "babba").replaceAll("[yY]", "bbaaa").replaceAll("[zZ]", "bbaab");
        System.out.println(messageEncrypted);

        /* koncept z forem i iterowaniem po długości message
        i podstawianiem z arraya odpowiedniego odpowiednika
        !!!! błędne założenie co do logiki, iteruje po długości a nie po literach i źle podstawia !!!! */

        /*String letter;
        String bacon;
        char chars;
        for (int i = 0; i < message.length(); i++)
        {
            chars = message.charAt(i);
            letter = String.valueOf(chars); 
            bacon = baconAlphabet[i];
            messageEncrypted += message.replace(letter, bacon);
        }
        System.out.println(messageEncrypted);*/
        return messageEncrypted;
    }

    public String baconianDecryption(String messageEncrypted)
    {
        messageEncrypted = messageEncrypted.toLowerCase();

        String messageDecrypted = messageEncrypted.replaceAll("aaaaa", "a").replaceAll("aaaab", "b").replaceAll("aaaba" ,"c")
        .replaceAll("aaabb" ,"d").replaceAll("aabaa" ,"e").replaceAll("aabab" ,"f").replaceAll("aabba" ,"g")
        .replaceAll("aabbb" ,"h").replaceAll("abaaa" ,"i").replaceAll("abaab" ,"j").replaceAll("ababa" ,"k")
        .replaceAll("ababb" ,"l").replaceAll("abbaa" ,"m").replaceAll("abbab" ,"n").replaceAll("abbba" ,"o")
        .replaceAll("abbbb" ,"p").replaceAll("baaab" ,"r").replaceAll("baaba" ,"s").replaceAll("baabb" ,"t");
        System.out.println(messageDecrypted);

        return messageDecrypted;
    }//method
}//class