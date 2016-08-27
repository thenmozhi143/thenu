import java.util.Scanner;
{
public class reverse str
{
public static void main(String[] args)
{
Scanner in=new Scanner(system.in);
int n,rev=0;
system.out.print("enter the number");
n=in.nextInt();
while(n!=0)
    {
    rev=rev*10;
    rev=rev+n%10;
    n=n/10;
    }
system.out.print(rev);
}
}
