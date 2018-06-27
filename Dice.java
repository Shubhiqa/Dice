
public class Dice {

	int sides;
	Dice (int sides)
	{
		this.sides=sides;
	}
	
	static int Dice_Roll(int side)
	{
		String str;
		int max=side,min=1;
		int x=(int) (Math.random()*((max-min)+1)+min);
		str=Integer.toString(x);
		System.out.println(str);
		return 0;
	
		
	}
	
}
