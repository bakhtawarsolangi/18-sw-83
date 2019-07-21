class Circle
{
	private double radius;
	private String color;


	public Circle()
	{
	    radius=1.0;
	    color="red";
	}

	public Circle(double r)
	{
	   radius=r;
	}
	public Circle(double r,String c)
	{
	   radius=r;
	   color=c;
	}
	public double getRadius()
	{
	   return radius;
	}
	public void setRadius(double r)
	{
	   radius=r;
	}
	public String getColor()
	{
	   return color;
	}
	public void setColor(String c)
	{
	   color=c;
	}
	public double getArea()
	{
		double area = 3.14*radius*radius;
	   return radius;
	}
	public String toString()
	{
	   return "Circle[radius="+radius+"color="+color+"]";
	}
}

class Cylinder extends Circle
{
	private double height;

	public Cylinder()
	{

	   double height=1.0;
	}
	public Cylinder(double r)
	{
	   super(r);
	}
	public Cylinder(double r,double h)
	{
	   super(r);
	   height=h;
	}
	public Cylinder(double r,double h,String c)
	{
		//super(r,c);
	   setRadius(r);
	   height=h;
	   setColor(c);
	}
	public double getHeight()
	{
	    return height;
	}
	public void setHeight(double h)
	{
	   height=h;
	}
	public double getVolume()
	{
		double volume=3.14*getRadius()*getRadius()*height;
	   return volume;
	}
	}

class MainCircle
{
	public static void main(String args[])
	{
	   Circle c=new Circle(1.0,"red");


	    System.out.println(c.getRadius());
	    System.out.println(c.getColor());
	    System.out.println(c.getArea());
	    System.out.println(c.toString());



	    Cylinder c1=new Cylinder(1.0);



	    System.out.println(c1.getHeight());
	    System.out.println(c1.getVolume());

	}
}