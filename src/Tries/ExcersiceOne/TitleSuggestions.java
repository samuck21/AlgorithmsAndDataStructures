package Tries.ExcersiceOne;

import Tries.Trie;

public class TitleSuggestions {

    public boolean[] titleSuggestion(String[] books,String[] prefixes, boolean ignoreCase){
        Trie dictionary = new Trie(ignoreCase);
        for(String book: books){
            dictionary.insert(book);
        }
        boolean[] result  = new boolean[prefixes.length];
        for (int i = 0; i<prefixes.length;i++){
            result[i]= dictionary.search(prefixes[i]);
        }
        return result;
    }
}
