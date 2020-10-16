
public class IsProperly {
	public static void main(String[] args)
	{
		String sequence = "((a+b)*c)-(a-b)";
		boolean checkResult = IsProperly(sequence);
		if (checkResult)
		{
			System.out.println("Brackets Correct!");
		}
		else
		{
			System.out.println("Brackets Not Correct!");
		}		
	}
	private static boolean IsProperly(String sequence)
	{
		int checkBrackets = 0;
		for (int i = 0; i < sequence.length(); i++)
		{
			if (sequence.charAt(i) == '(')
			{
				checkBrackets++;
			}
			else if (sequence.charAt(i) == ')')
			{
				checkBrackets--;
			}
		}
		if (checkBrackets == 0)
		{
			return true;
		}
		return false;
	}
}
