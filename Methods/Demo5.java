package tns.com.Methods;

class Credentials
{
	private String un;		//IV
	private String pwd;
	
	void setUn(String username)
	{
		un=username;
	}
	void setPwd(String password)
	{
		pwd=password;
	}

	String getUn()
	{
		return un;
	}
	String getPwd()
	{
		return pwd;
	}
}
class Demo5 
{
	public static void main(String[] args) 
	{
		Credentials c = new Credentials();
		
		c.setUn("StudyOnline");
		c.setPwd("3443");

		System.out.println(c.getUn());
		System.out.println(c.getPwd());

	}
}
