package pack2;

import java.util.LinkedList;
import java.util.List;

import pack1.Student;

public class Main7 {
   public static void main(String[] args) {
	  //create a list of students.
	   //perform all the operations
	   Student s1=new Student(1,"ramu",20,56,75);
 	  Student s2=new Student(2,"thanish",64,75,36);
 	  Student s3=new Student(3,"charan",75,85,46);
 	  
 	  List<Student> e,students=new LinkedList<>();
 	  students.add(s1);
 	  students.add(s2);
 	  students.add(s3);
 	  students.add(new Student(4,"rani",66,76,47));
 	  System.out.println(students);
 	  
 	  System.out.println(students.contains(new Student(5,"varun",55,75,46)));
 	  
 	  int pos=students.indexOf(new Student(6,"gopi",77,86,64));
 	  
 	  for(Student student:students) {
 		  System.out.println(student.getAverage());
 	  }
 	  
 	  students.clear();
 	  System.out.println(students.isEmpty());
   }
}
