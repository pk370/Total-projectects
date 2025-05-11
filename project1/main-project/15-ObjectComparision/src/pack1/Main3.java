package pack1;

import pack2.Student;

public class Main3 {
    public static void main(String[] args) {
		Student student1=new Student(1,"tharun",56,87,49);
		Student student2=new Student(23,"navin",78,69,85);
		
		
		int r = student1.compareTo(student2);
	}
}
