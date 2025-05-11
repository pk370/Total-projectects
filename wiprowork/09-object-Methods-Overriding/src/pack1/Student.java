package pack1;

import java.util.Objects;

public class Student {
    int rollNumber;
    String name;
    int mark1,mark2,mark3;
	public Student(int rollNumber, String name, int mark1, int mark2, int mark3) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2
				+ ", mark3=" + mark3 + "]";
	}
    public double totalMarks() {
    	return mark1+mark2+mark3;
    }
	@Override
	public int hashCode() {
		return Objects.hash(mark1, mark2, mark3, name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return mark1 == other.mark1 && mark2 == other.mark2 && mark3 == other.mark3 && Objects.equals(name, other.name)
				&& rollNumber == other.rollNumber;
	}
    
}
