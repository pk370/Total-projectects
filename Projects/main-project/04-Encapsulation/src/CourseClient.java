
public class CourseClient {
    public static void main(String[] args) {
		Course c=new Course();
		c.setCourseId(2);
		c.setCourseName("java");
		c.setFees(15000);
		
		System.out.println(c.getCourseId());
		System.out.println(c.getCourseName());
		System.out.println(c.getFees());
		
		System.out.println("payement for month"+c.getEmi());
	}
}
