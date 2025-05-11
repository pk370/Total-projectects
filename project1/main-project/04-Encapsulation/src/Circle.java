
public class Circle {
    private int radius;
    static double PI=3.14;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
       
	public double getArea() {
		double area=PI*radius*radius;
		return area;
	}
	public static void greet() {
		System.out.println("how are you");
		System.out.println(PI);
	}
}
