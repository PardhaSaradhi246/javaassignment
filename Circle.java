import java.util.Scanner;
 class Circle
{
	public static void main( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		circle c = new circle();
		System.out.println(c.area(a));
	}
}
class circle
{

 double Radius;
	private double validateRadius(double r)
	{
		return r>0.0 ? r:1.0;
	}
	public void setRadius(double r)
	{
		Radius=validateRadius(r);
	}

	public double area(double Radius)

	{
    this.Radius = Radius;
		return 3.14 * Radius * Radius;
	}
}