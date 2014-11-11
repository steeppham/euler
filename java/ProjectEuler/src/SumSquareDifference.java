
public class SumSquareDifference 
{
	public static int sumSquareDifference(int range)
	{
		int difference = 0;
		
		for(int j = 1; j < range; j++)
		{
			for(int i = j + 1; i < range+1; i++)
			{
				difference += 2 * i * j;
			}
		}
		
		return difference;
	}
}
