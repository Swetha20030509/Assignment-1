package Assignment_1;

public class Randomnumber {
	/*
	 * Random number : 85
		Random number : 93
		Random number : 35
		Random number : 52
		Random number : 68
		Random number : 99
		Random number : 55
		Random number : 97
		Random number : 72
		Random number : 74
	 */

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			int random=(int)(Math.random()*100)+1;
			System.out.println("Random number : "+random);
		}

	}

}
