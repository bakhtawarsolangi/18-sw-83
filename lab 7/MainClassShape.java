class Shape
{
	private String color;
	private boolean filled;

	public Shape()
	{
		color="Red";
		filled=true;
	}
	public Shape(String c,boolean f)
	{
		color=c;
		filled=f;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String c)
	{
		color=c;
	}
	public boolean isFilled()
	{
		if(color!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setFilled(boolean f)
	{
		filled=f;
	}
	public String toString()
	{
		return "[Color: "+color+"]";
	}
}
class Circle extends Shape
{
	private double radius;
	private final double PI=3.14;

	public Circle()
	{
		radius=1.0;
	}
	public Circle(double r)
	{
		radius=r;
	}
	public Circle(double r,String c,boolean f)
	{
		super(c,f);
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double r)
	{
		radius=r;
	}
	public double getArea()
	{
		return (PI*radius*radius);
	}
	public double getPerimeter()
	{
		return (2*PI*radius);
	}
	public String toString()
	{
		return "Circle[Color: "+getColor()+", Radius= "+getRadius()+"]";
	}
}
class Rectangle extends Shape
{
	private double width;
	private double length;

	public Rectangle()
	{
		width=1.0;
		length=1.0;
	}
	public Rectangle(double w,double l)
	{
		width=w;
		length=l;
	}
	public Rectangle(double w,double l,String c,boolean f)
	{
		super(c,f);          
		width=w;
		length=l;
	} 
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double w)
	{
		width=w;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double l)
	{
		length=l;
	}
	public double getArea()
	{
		return (length*width);
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	public String toString()
	{
		return "Rectangle[Width= "+width+", Length= "+length+", Color= "+getColor()+"]";
	}
}
class Square extends Rectangle
{
	private double side;
	public Square()
	{
		side=1.0;
	}
	public Square(double s)
	{
		side=s;
	}
	public Square(double s,String c,boolean f)
	{
		side=s;
		setColor(c);
		setFilled(f);
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double s)
	{
		side=s;
	}
	public double getArea()
	{
		return (side*side);
	}
	public double getPerimeter()
	{
		return (4*side);
	}
	public String toString()
	{
		return "Square[Side= "+side+", Color: "+getColor()+"]";
	}
}
class MainClassShape
{
	public static void main(String[]args)
	{
		Shape s=new Shape("Purple",true);
        System.out.println("Any Shape(not specified): "+s.toString());
		
		Circle c=new Circle(2.2,"Black",true);
		System.out.println(c.toString());
		System.out.println("Area of Circle: "+c.getArea());
		System.out.println("Perimeter of Circle: "+c.getPerimeter());

		Rectangle r=new Rectangle(3.4,2.5,"White",true);
		System.out.println(r.toString());
		System.out.println("Area of Rectangle: "+r.getArea());
		System.out.println("Perimeter of Rectangle: "+r.getPerimeter());
		
		Square sq=new Square(3.0,"Pink",true);
		System.out.println(sq.toString());
		System.out.println("Area of Square: "+sq.getArea());
		System.out.println("Perimeter of Square: "+sq.getPerimeter());
	}
}