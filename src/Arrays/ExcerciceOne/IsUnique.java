package Arrays.ExcerciceOne;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    private static int NUMBERS_OF_CHARS =128;
    public static boolean isUnique(String string){
        if(string.length() >NUMBERS_OF_CHARS)return false;
        Set<Character> characters = new HashSet<>();
        for(Character c: string.toCharArray()){
            if(characters.contains(c))return false;
            characters.add(c);
        }

        return  true;
    }

}
