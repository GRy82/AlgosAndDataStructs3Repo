import java.util.Arrays;
import java.util.Collections;

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
        String[] rotations = new String[originalStr.length()];
        for(int i = 0; i < originalStr.length(); i++){
            int indexBeingCopied = i;
            var lettersCopied = 0;
            String newStr = "";
            while(lettersCopied < originalStr.length()){
                if(indexBeingCopied == originalStr.length())  
                    indexBeingCopied = 0;
                newStr += originalStr.charAt(indexBeingCopied);
                lettersCopied++;
                indexBeingCopied++;            
            }
            rotations[i] = newStr;
        }
        if(Arrays.asList(rotations).contains(possibleRotation))
            return true;
        return false; 
    }
}
