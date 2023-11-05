package Encapsulation;

public class student
{
	public static void main(String aargs[])
	{
		studentinfo obj=new studentinfo();
		obj.setid(1);
		obj.setname("Shailesh");
		obj.setaddress("talegaon");
		obj.setpass(44);
		System.out.println("ID of student is :"+obj.getid());
		System.out.println("Name of student is :"+obj.getname());
		System.out.println("Address of student is :"+obj.getaddress());
		System.out.println("password of student is :"+obj.getpass());

	}
}

class studentinfo
{
	private Integer id;
	private String address;
	private String name;
	private Integer password;


	public Integer getid()
	{
		return id;
	}

	public void setid(Integer id)
	{
		this.id=id;
	}

	public String getaddress()
	{
		return address;
	}

	public void setaddress(String address)
	{
		this.address=address;
	}

	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name=name;
	}

	public Integer getpass()
	{
		return password;
	}

	public void setpass(Integer password)
	{
		this.password=password*10;
	}

	@Override
	public String toString()
	{
		return "Employee [id="+id+",name="+name+",address="+address+"]";
	}


}
