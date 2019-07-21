class Person
{
   private String name;
   private String address;


   public Person(String n,String a)
	{
		name=n;
		address=a;
	 }

	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public String toString()
	{
		return "Person[name: "+name+", Address: "+address+"]";
	}
}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;


	public Student(String n,String a,String p,int y,double f)
	{
		super(n,a);
		program=p;
		year=y;
		fee=f;
	}
	public String getProgram()
	{
		return program;
	}
	public void setProgram(String p)
	{
		program=p;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int y)
	{
		year=y;
	}
	public double getFee()
	{
		return fee;
	}
	public void setFee(double f)
	{
		fee=f;
	}
	public String toString()
	{
		return "Student[Person[Name: "+getName()+", Address: "+getAddress()+"], Program: "+program+", Year: "+year+", Fee: "+fee+"]";
	}
}

class Staff extends Person
{
	private String school;
	private double pay;


	Staff(String n,String a,String s,double p)
	{
		super(n,a);
		school=s;
		pay=p;
	}
	public String getSchool()
	{
		return school;
	}
	public void setSchool(String s)
	{
		school=s;
	}
	public double getPay()
	{
		return pay;
	}
	public void setPay(double p)
	{
		pay=p;
	}
	public String toString()
	{
		return "Staff[Person[Name: "+getName()+", Address: "+getAddress()+"], School: "+school+", Pay: "+pay+"]";
	}
}

class MainClassPerson
{
	public static void main(String[]args)
	{
		Person p1=new Person("Bakhtawar Solangi","R185, Sector R3, Gulshane maymar, Karachi");

		System.out.println(p1.toString());

		Student s1=new Student("Ahsan Shaikh","A78, Honda palace, Phase-I, Hyderabad","Software Engineering",2018,3200);

		System.out.println(s1.toString());

		Staff st=new Staff("Samiullah ","A-768, hala naka, Phase-I, Hyderabad","Paras Public school",15000);

		System.out.println(st.toString()); 

	}
}