import java.util.Scanner;
class leap year
{	
	public static void main(String args[])
	{
  	 int year;
	 System.out.println("enter the  year");
	 Scanner.in=newScanner(System.in);
	 year=in.nextInt();
	 if((year%400==0)||((year%4==0)&&(year%100!=0)))
	 System.out.println("year" +year+ "is leap year");
	 else
	 System.out.println("year" +year+ "is not leap year");
	}
}
