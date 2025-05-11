
public class Student {
   int  rollNumber;
   String name;
   int mark1,mark2,mark3;
   
   int getTotalMarks() {
	   return mark1+mark2+mark3;
   }
   double getAverage() {
	   int average=(mark1+mark2+mark3)/3;
	   return average;
   }
}
