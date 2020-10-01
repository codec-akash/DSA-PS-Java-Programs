public class SieveOfEratosthenes {
	
	private static int limit = 1000; // Only used if no value passed through.
	private static boolean[] booleanArray;
	private static int totalPrimes;
	private static long calcTime;
	
	public static void main(String[] args)
	{
		long startTime = System.currentTimeMillis();
		setup(args);
		findAllPrimes();
		displayPrimes();
		long endTime = System.currentTimeMillis();
		
		long timeTaken = endTime - startTime;
		
		System.out.println();
		System.out.println();
		System.out.println("It took " + calcTime + "ms to calculate the prime numbers below " + limit + ".");
		System.out.println("The complete algorithm took " + timeTaken + "ms to finish.");
		System.out.println();
		System.out.println();
		System.out.println("There are " + totalPrimes + " prime numbers below " + limit + ".");
	}
	
	private static void setup(String[] args)
	{
		if(args.length > 0)
		{
			limit = Integer.parseInt(args[0]);
		}
		
		booleanArray = new boolean[limit + 1];
		
		for(int position = 0; position <= limit; position++)
		{
			booleanArray[position] = false;
		}
	}
	
	private static void findAllPrimes()
	{
		long calcStartTime = System.currentTimeMillis();
		for(int position = 2; position <= Math.sqrt(limit); position++)
		{
			if(booleanArray[position] == false)
			{
				int multiple = position * 2;
				while(multiple <= limit)
				{
					booleanArray[multiple] = true;
					multiple += position;
				}
			}
		}
		long calcEndTime = System.currentTimeMillis();
		
		calcTime = calcEndTime - calcStartTime;
	}
	
	private static void displayPrimes()
	{
		for(int position = 2; position <= limit; position++)
		{
			if(booleanArray[position] == false)
			{
				totalPrimes++;
				System.out.print(position + ", ");
			}
		}
	}

}
