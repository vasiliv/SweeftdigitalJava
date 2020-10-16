import java.util.ArrayList;

public class MinSplit {

	public static void main(String[] args)
		{
			int amount = 116;
			System.out.println("Amount = " + minSplit(amount));	
			
		}
		private static int minSplit(int amount)
		{
			int[] array = new int[] {50, 20, 10, 5, 1};
			int count = 0;
			ArrayList<Integer> list = new ArrayList<Integer>(); //optional
			int number = 116;
	
			for (int i = 0; i < array.length; i++)
			{
				while (number >= array[i])
				{
					number = number - array[i];
					count++;
					list.add(array[i]); //optional
				}
			}
	
			for (int item : list)
			{ //optional
				System.out.println(item); //optional
			} //optional
			System.out.println(); //optional
			return count;
		}
	
	
}
