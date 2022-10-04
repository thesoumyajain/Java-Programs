package tns.com.Methods;

//no passing the input and no returning the output.
class Demo 
{
	public static void main(String[] args) 
	{
		 Addition a1=new Addition();
		 a1.add();
	}
}

class Addition
{
	void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}