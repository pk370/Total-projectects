package pack1;

public class Circle {
    int radius;
    public Circle(int radius){
    	this.radius=radius;
    }
    
    private void setRadius() {
		// TODO Auto-generated method stub

	}
    public int getRadius() {
		return radius;
	}
    
    public double getArea() {
    	return 3.14*this.radius*this.radius;
    }

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
    
}
