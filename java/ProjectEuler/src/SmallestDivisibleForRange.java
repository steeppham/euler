import java.util.LinkedList;


public class SmallestDivisibleForRange 
{
//	public static int smallest(int min, int max)
//	{
//		LinkedList<Integer> numbers = new LinkedList<Integer>();
//		for(int i = min; i <= max; i++)
//		{
//			numbers.add(i);
//		}
//		
//		int smallest = 1;
//		int i = min;
//		
//		for(int j = min; i<max;i++)
//		{
//			
//		}
//		
//		while(numbers.size() > 0)
//		{
//			if(numbers.get(i) != 0)
//			{
//				if(smallest % i == 0)
//				{
//					numbers.set(i,  0);
//				}
//				
//				int sum = i;
//				while(!isWithinRange(max, i, sum))
//				{
//					sum *= i; 
//					numbers.set(sum-1, 0);
//				}
//				
//				smallest *= sum; 
//				
//				i +=1;
//			}
//		}
//		return smallest;
//	}
//	
	private static boolean isWithinRange(int max, int multiplier, int number)
	{
		if(number * multiplier < max)
		{
			return true;
		}
		return false;
	}
//		int smallest = 1;
//		for(int i = min; i < max; i++)
//		{
//			if(smallest % i != 0)
//			{
//				smallest *= i;
//			}
//		}
//		
//		return smallest;
//	}
	
	public static int answer(int min, int max)
	{
		int sum;
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		if(min == 1)
		{
			min +=1;
		}
		sum = min;

		numbers.add(min);
		
		for(int i = min+1; i < max;i++)
		{
			if(sum % i != 0)
			{
				boolean found =  false;
				int num = 1;
				while(sum % i != 0)
				{
					for(int number: numbers)
					{
						if(i % number == 0)
						{
							sum *= number;
							num = number * number;
							found = true;
							break;
						}
					}
					if(!found)
					{
						sum *=i;
						numbers.add(i);
					}
					else
					{
						numbers.add(num);
					}
				}
			}
		}
		
		return sum;
	}
	
//	private static int findCommonDenominatorAndDivide(int i, LinkedList<Integer> numbers)
//	{
//		int answer = 0;
//		
//		while()
//		{
//			
//		}
//			
//		return answer;
//	}
}
