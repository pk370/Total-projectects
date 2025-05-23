package pack1;

import java.util.Objects;

public class Square {
    
	int size;

	public Square(int size) {
		super();
		this.size = size;
	}
	public int getArea() {
		return this.size*this.size;
	}
	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(size);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return size == other.size;
	}
	
    
}
