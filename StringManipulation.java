

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
        String[] wordsArray = str.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        for(int i = wordsArray.length - 1; i >= 0; i--)
            reversedWords.append(wordsArray[i] + " ");
        
        return reversedWords.toString();
    }
}
