package view;

import controller.Controller7;

public class Main7 
{

	public static void main(String[] args) 
	{
		Controller7 c = new Controller7();
		
		int n = 5598;
		int re = 0;
		
		int resultado = c.SomaDig(n, re);
		
		System.out.println(n + " a soma dos termos da: " + resultado);
		
		
	}
	
}
