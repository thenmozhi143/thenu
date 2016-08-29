import java.util.Scanner;
class largest three
{	
	public static void main(String args[])
	{
  	 int x,y,z;
	 System.out.println("enter the  three integer");
	 Scanner.in=newScanner(System.in);
	 x=in.nextInt();
	 y=in.nextInt();
 	 z=in.nextInt();
	 if(x>y && x>z)
	System.out.println("x is largest");
	else if(y>x && y>z)
 	System.out.println("y is largest");
 	else
	System.out.println("z is largest");
	}
}
