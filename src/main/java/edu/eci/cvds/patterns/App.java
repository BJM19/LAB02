package edu.eci.cvds.patterns;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	if (args.length>0)
		{
		System.out.print("Hello");
		for(int i=0; i<args.length;i++)
			{
				System.out.print(" "+args[i]);
			}
		System.out.print(" !");
		}
	else
		{
		System.out.println ("Hello World!");
		}
    }
}
