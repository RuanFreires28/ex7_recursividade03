package controller;

public class Controller7 
{

	public Controller7()
	{
		super();
	}
	
	public int SomaDig (int n, int re)
	{
		if (n == 0)
		{
			return re;
		}
		else
		{	
			re = re + (n%10);
					
			return SomaDig ((int)n / 10, re);
		}
	}
	
}
