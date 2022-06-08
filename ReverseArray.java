package FirstDeclaration;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int [10];
Scanner r=new Scanner(System.in);

System.out.println("enter element in Array");

for (int i=0;i<a.length;i++)
{
	a[i]=r.nextInt();
	
}
System.out.println("array element");

for (int i=0;i<10;i++)
{System.out.println(a[i]+" ");
}
System.out.println("reverse array element");
for (int i=a.length-1;i>=0;i--)
{System.out.println(a[i]+" ");
}
}
	}


