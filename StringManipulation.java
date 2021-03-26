import java.util.Stack;

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
        Stack<Character> reversalStack = new Stack<>();
        String reversedString = "";
        for(var letter : str.toCharArray())
            reversalStack.push(letter);

        while(!reversalStack.isEmpty())
            reversedString += reversalStack.pop();
        
        return reversedString;
    }
}
