
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome  {
    public static void main(String[] args) {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
		
        try {

            System.out.print("Input string: ");
            String input = inputStream.readLine();
			System.out.print("Answer: ");
			
            if(isPalindrome(input))
				System.out.print("String is a palindrome");
			else 
				System.out.print("String not palindrome");

        } catch (IOException exception) {
            System.err.println("Input error");
        }
    }

    public static boolean isPalindrome(String input) {
        String reverseInput = reverseString(input);
        if(input.compareToIgnoreCase(reverseInput) == 0)
            return true;
        return false;
    }
	
	public static String reverseString(String s)
	{
		String s_reverse ="";
		for(int i = s.length()-1; i>=0; i--)
		{
			s_reverse += s.charAt(i);
		}
		return s_reverse;
	}
}