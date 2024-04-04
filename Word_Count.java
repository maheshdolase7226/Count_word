package count_word;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Word_Count

{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        Map<String, Integer> wordCountMap = new HashMap<>();
         String[] words = input.split("\\s+");
         for (String word : words) 
         {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
         }
        
	         int total = wordCountMap.size();
	         System.out.println("Total number of words: " + total);
	        
	         scanner.close();
    }
}