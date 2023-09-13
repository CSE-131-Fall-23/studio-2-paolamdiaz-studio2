package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int startAmount = in.nextInt();
		double winChance = in.nextDouble();
		int winLimit = in.nextInt();
		int totalSimulations = in.nextInt(); 
		
		for (int startDay = 1; startDay <= totalSimulations; startDay++)
		{
			
			while (startAmount < winLimit)
			{
				if (winChance > Math.random())
				{
					startAmount--;
					
				}
				if (winChance < Math.random())
				{
					startAmount++;
					
				}
				
			}
			
		}
			
			
			
		

	}

}
