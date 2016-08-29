import java.util.Scanner;
class palindrome
{	
	public static void main(String args[])
	{
  	 int x,y,z;
	 System.out.println("enter the  three integer");
	 Scanner.in=newScanner(System.in);
	 int num=read.nextInt();
 	int n=num;
	int rev=0,rmd;
	while(num>0)
	{
	rmd=num%10;
	rev=rev*10+rmd;
	num=num/10;
	}
	if(rev==n)
	System.out.println("its palindrome");
	else
	System.out.println("not palindrome");
	}	
	
}
