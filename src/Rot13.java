import java.util.ArrayList;


public class Rot13 { 

    public String decrypt(String[] args) {
        String s = args[2];
        ArrayList<String> tmp = new ArrayList<String>();
        if (args[0] == "Rot13" && args[1] == "-e" || args[1] == "-d");{
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'm'){
                    c += 13;
                } else if(c >= 'A' && c <= 'M'){
                    c += 13;
                } else if(c >= 'n' && c <= 'z'){
                    c -= 13;
                } else if(c >= 'N' && c <= 'Z'){
                    c -= 13;
                }
                String result = Character.toString(c);
                tmp.add(result);
            }
            for(int i=0;i<tmp.size();i++){
                System.out.print(tmp.get(i));
            } 
        }
        return "Error";
    }

}