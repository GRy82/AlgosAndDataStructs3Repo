import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringManipulation {
    public static int vowelsInString(String str){
        if(str == null) return 0;

        String vowels = "AEIOU";
        int vowelCount = 0;
        for (var letter : str.toCharArray()) {
            if(vowels.indexOf(Character.toLowerCase(letter)) != -1) 
                vowelCount++;
        }

        return vowelCount;
    }

    public static String stringReversal(String str){
        if(str == null) return "";
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i --)
            reversedString.append(str.charAt(i));

        return reversedString.toString();
    }

    public static String reverseWords(String str){
        if(str == null) return "";
        String[] wordsArray = str.trim().split(" ");
        Collections.reverse(Arrays.asList(wordsArray));
        return String.join(" ", wordsArray);
    }

    public static Boolean checkRotation(String originalStr, String possibleRotation){
        return (originalStr.length() == possibleRotation.length() &&
            (originalStr + originalStr).contains(possibleRotation));
    }

    public static String removeDuplicates(String str){
        if (str == null) return "";
        StringBuilder noDuplicateStr = new StringBuilder();
        Set<Character> charactersSeen = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            var current = str.charAt(i);
            if(!charactersSeen.contains(current)){
                noDuplicateStr.append(current);
                charactersSeen.add(current);
            }
        }
        return noDuplicateStr.toString();
    }

    public static char mostRepeatedCharacter(String str){
        if(str == null || str.isEmpty()) 
            throw new IllegalArgumentException();

        final int asciiCount = 256;
        int[] characterCount = new int[asciiCount];
        for(var letter : str.toCharArray())
            characterCount[letter]++;

        char highestQtyChar = ' ';
        int highestQty = -1;
        for(int i = 0; i < characterCount.length; i++){
            if(characterCount[i] > highestQty){
                highestQty = characterCount[i];
                highestQtyChar = (char)i;
            }
        }
        return highestQtyChar;
    }

    public static Boolean palindrome(String str){
        if(str == null) return false;
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left++) != str.charAt(right--))
                return false; 
        }

        return true;
    }

    public static String capitalizeFirsts(String str){
        if(str.trim().isEmpty() || str == null) 
            return "";

        String[] words = str
            .trim()
            .replaceAll(" +", " ")
            .split(" ");
        for(var i = 0; i < words.length; i++){
            words[i] = words[i].substring(0, 1).toUpperCase() 
                + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }
}
