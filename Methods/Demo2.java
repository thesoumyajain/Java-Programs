package tns.com.Methods;

//passing the input and returning the output.

class Demo2 
{
	public static void main(String[] args) 
	{
		 Additions1 a1=new Additions1();
		 int x=12;
		 int y=12;
		 int res = a1.add(x,y);
		 System.out.println(res);

	}
}

class Additions1
{
	int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
}