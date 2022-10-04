package tns.com.Methods;

//passing the input and no returning the output.
class Demo1 
{
	public static void main(String[] args) 
	{
		 Additions2 a1=new Additions2();
		 int x=12;
		 int y=8;
		 a1.add(x,y);
	}
}

class Additions2
{
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
}