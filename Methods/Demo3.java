package tns.com.Methods;

//no passing the input and returning the output.

class Demo3 
{
	public static void main(String[] args) 
	{
		 Additions a1=new Additions();
		 int res = a1.add();
		 System.out.println(res);

	}
}

class Additions
{
	int add()
	{
		int a,b,c;
		a=14;
		b=14;
		c=a+b;
		return c;
	}
}