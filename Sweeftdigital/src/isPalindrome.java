
public class isPalindrome {
	public static boolean answer;

	public static void main(String[] args)
	{
		boolean result = isPalindrome("abba");
		System.out.print(result);  
	}
	private static boolean isPalindrome(String text)
	{

		for (int i = 0; i < (int)text.length() / 2; i++)
		{
			if (text.charAt(i) == text.charAt(text.length() - 1 - i))
			{
				answer = true;
			}
			else
			{
				return false;
			}
		}
		return answer;
	}


}
