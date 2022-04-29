import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int n,r,sum=0;
Scanner s=new Scanner(System.in);
System.out.println(" enter a number: ");
int a=s.nextInt();
n=a;
while(n>0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==a)
{
System.out.println("it is a armstrong number");
}
else
{ 
System.out.println("it is not a armstrong number");
}
}
}
