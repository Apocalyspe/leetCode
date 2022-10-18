import java.util.*;

public class NonRepeatChars {
    public static void main(String args[]) {
        int result = lengthOfLongestSubstring("qrsvbspk");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        Stack<Character> nonRepeatingCharsStack = new Stack<Character>();
        int currentSubStringLength = 0;
        int largestSubStringLength = 0;
        int startingPos = 0;

        for(int i=0; i<s.length(); i++) {
            if(nonRepeatingCharsStack.search(s.charAt(i)) == -1){
                nonRepeatingCharsStack.push(s.charAt(i));
                currentSubStringLength = nonRepeatingCharsStack.size();
            }
            else {
                if(largestSubStringLength <= currentSubStringLength){
                    largestSubStringLength = currentSubStringLength;
                    nonRepeatingCharsStack.clear();
                }else {
                    nonRepeatingCharsStack.clear();;
                }
                if(i == s.length() - 1)
                {
                    
                    return largestSubStringLength > currentSubStringLength ? largestSubStringLength : currentSubStringLength;
                }
                else
                {
                    i = startingPos;
                    startingPos++;
                }
                
            }
        }

        return largestSubStringLength > currentSubStringLength ? largestSubStringLength : currentSubStringLength;
        
    }

    //for(int i=0; i<s.length(); i++) {
    //     if (nonRepeatingCharsStack.search(s.charAt(i)) == -1){
    //         nonRepeatingCharsStack.push(s.charAt(i));
    //     }else {
    //         startPosition += 1;
    //         i = startPosition; 
    //         nonRepeatingCharsStack.clear();
    //     }
    // }
}