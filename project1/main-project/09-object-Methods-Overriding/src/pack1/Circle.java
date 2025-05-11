package pack1;

import java.util.Objects;

public class Circle {
     int radius;
     public double getArea() {
    	 return 3.14*radius*radius;
     }
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}
   
}
