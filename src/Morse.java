import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;




public class Morse {
	public static String[][] morse_alphabet() {
		
        String tab[][] = {
            {"A", ".-"},
            {"B","-..."},
            {"C","-.-."}, 
            {" ", "x"},
            {"D", "-.."},
            {"E", "."},
            {"F", "..-."},
            {"G", "--."},
            {"H", "...."},
            {"I", ".."},
            {"J", ".---"},
            {"K", "-.-"},
            {"L", ".-.."},
            {"M", "--"},
            {"N", "-."},
            {"O", "---"},
            {"P", ".--."},
            {"R", ".-."},
            {"S", "..."},
            {"T", "-"},
            {"U", "..-"},
            {"V", "...-"},
            {"W", ".--"},
            {"X", "-..-"},
            {"Y", "-.--"},
            {"Z", "==.."}};


        return tab;
    }
    public void encrypt(String[] args){
        String textToCipher = args[2].toUpperCase();
        String cipherText = "";
        String[][] tab = morse_alphabet();

        for(int i = 0; i < textToCipher.length(); i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[j][0].charAt(0) == textToCipher.charAt(i)){
                    cipherText += tab[j][1] + "x";       
                } 
            }
        }

        System.out.println(cipherText);
    }
    public String decrypt(String[] args){
        String[][] tab = morse_alphabet();
        String textToCipher = args[2].toUpperCase();
        String cipherText = "";
        String replaceText = textToCipher.replace("XX", " ");
        String[] splittedText = textToCipher.split("X");


        
        for(int i = 0; i < splittedText.length; i++){
            for(int j = 0; j < tab.length; j++){
                if(tab[j][1].equals(splittedText[i])){
                    cipherText += tab[j][0];       
                } 
            }   
        }
        System.out.println(cipherText);
        return cipherText;

    }
    
}
