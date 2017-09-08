package dailyChallanges;
import java.util.Scanner;
public class July242 {
	public static void main(String[] args) {
        //Your Code Here
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=a;
int c=a+1;
int x=1;
int y=n*2;
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n*2;j++)
    {
        if(j==a)
        {
            System.out.print("/");
        }
        if(j==c)
        {
            System.out.print("\\");
        }
        if(j!=a &&j!=c)
        {
            System.out.print("*");
        }
    }
    a--;
    c++;
    System.out.println();
}
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n*2;j++)
    {
        if(j==x)
        {
            System.out.print("\\");
        }
        if(j==y)
        {
            System.out.print("/");
        }
        if(j!=x && j!=y)
        {
            System.out.print("*");
        }
    }
    x++;
y--;
    System.out.println();
}
    }
}