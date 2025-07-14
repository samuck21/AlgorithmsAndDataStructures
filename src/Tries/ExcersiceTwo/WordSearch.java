package Tries.ExcersiceTwo;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordSearch {

    class TrieNode{
        HashMap<Character, Tries.TrieNode>map;
        String word;
        public TrieNode(){
            map = new HashMap<>();
        }
    }
    public List<String> findWords(char[][] board, String[] words){
    List<String> result = new ArrayList<>();
    int rows = board.length;
    int cols = board[0].length;
//        TrieNode root = buildTrie(words,rows*cols);
        return  result;
    }
    private  void dfs(char[][] board,TrieNode current, int row, int col,List<String> result){
     if(current ==null) return;
     if(current.word != null){
         result.add(current.word);
         current.word = null;
     }
     if(row < 0 || row >= board.length || col<0||col >= board[0].length || !current.map.containsKey(board[row][col])){
         return;
     }
    // TrieNode next = current.map.get(board[row][col]);
    // dfs(board,next,row-1,col,result);
    }
//    private  TrieNode buildTrie(String[] words,int maxLen){
//
//    }

}
