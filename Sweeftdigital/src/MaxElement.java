
public class MaxElement {public static void main(String[] args)
{
	int[] Array = new int[] {10, -1, 0, 5, 9};
	int minInteger = NotContains(Array);
	System.out.println("Number = " + minInteger);
}
private static int NotContains(int[] Array)
{
	int minNumber = 0;
	for (int i = 1; i <= MaxElement(Array) + 1; i++)
	{
		boolean contains = false;
		for (int j = 0; j < Array.length; j++)
		{
			if (i == Array[j])
			{
				contains = true;
			}
		}
		if (!contains)
		{
			minNumber = i;
			break;
		}
	}
	return minNumber;
}
private static int MaxElement(int[] Array)
{
	int max = Array[0];
	for (int i = 0; i < Array.length; i++)
	{
		if (max < Math.abs(Array[i]))
		{
			max = Math.abs(Array[i]);
		}
	}
	return max;
}
}
