package tns.com.Methods;

//WAP to return the array.

class Demo4 
{
	public static void main(String[] args) 
	{
		 ArrayRetrun ar=new ArrayRetrun();
		 int[] x = ar.fun();
		 for (int i=0;i<=x.length-1;i++)
		 {
			System.out.println(x[i]);
		}
		 
	}
}

class ArrayRetrun
{
	int[] fun()
	{
		int[] a ={10,20,30,40}; 
		return a;
	}
}