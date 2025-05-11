
public class StudentClient {
   public static void main(String[] args) {
	
	   
	   //create one student object
	   //set the data rollNumber, name and 3  marks
	   //print the total
	   //print the average
	   
	   //create another student object
	   //set the data rollNumber, name and 3  marks
	   //print the total
	   //print the average
	   
	   Student student=new Student();
	   student.rollNumber=23;
	   student.name="pavan";
	   student.mark1=87;
	   student.mark2=84;
	   student.mark3=88;
	   System.out.println(student.getTotalMarks());
	   System.out.println(student.getAverage());
	   
	   Student student2=new Student();
	   student2.rollNumber=23;
	   student.name="raju";
	   student2.mark1=87;
	   student2.mark2=84;
	   student2.mark3=88;
	   System.out.println(student2.getTotalMarks());
	   System.out.println(student2.getAverage());
}
}
