package pack2;

import pack1.Student;

public class Main10 {
     public static void main(String[] args) {
		Student student1=new Student(1010,"ram",10,20,30);
		Student student2=new Student(1010,"sri",43,56,34);
		System.out.println(student1.equals(student2));
	}
}
