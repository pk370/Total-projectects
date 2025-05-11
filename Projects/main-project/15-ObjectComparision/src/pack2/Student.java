package pack2;

public class Student implements Comparable<Student> {
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
	public int compareTo(Student o) {
        if(this.rollNumber<o.rollNumber)
        	return -1;
        if(this.rollNumber>o.rollNumber)
        	return 1;
        return 0;
	}
	


}
