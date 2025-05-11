
public class Course {
     int courseId;
     String courseName;
     double fees;
     Course(){   //constructor method  --no argument constructor
    	 System.out.println("course is created");
     }
     Course(String courseName){//parameterized constructor
    	 
     }
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
     
     public double getEmi() {
    	 return this.fees/12;
     }
}
