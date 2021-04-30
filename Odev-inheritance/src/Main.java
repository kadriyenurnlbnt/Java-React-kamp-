
public class Main {

	public static void main(String[] args) {
	
		System.out.println("--- ��renci bilgisi ---");
		Student student = new Student();
		student.setId(1);
		student.setFirstName("kadriye nur");
		student.setLastName("Nalbant");
		student.setCourses("Java-React-Kursu");
		student.setCompletionRate("%50 tamamland�");
		student.setAdress("konya / T�rkiye");
		
		StudentManager studentManager= new StudentManager();
		studentManager.completionRate(student);
		studentManager.addAdress(student);
		
		
       System.out.println("--- E�itmen bilgileri ---");
       
       Instructor instructor = new Instructor();
       instructor.setId(1);
       instructor.setFirstName("Engin");
       instructor.setLastName("Demiro�");
       instructor.setPhoneNum("05551112323");
       
       InstructorManager instructorManager = new InstructorManager();
       instructorManager.addPhoneNum(instructor);
       
       
       System.out.println("---Kullan�c� bilgileri---");
       
       Users users = new Users();
       users.setId(2);
       users.setFirstName("kulllan�c�");
       users.setLastName("kullan�c�");
       users.setCourses("c# angular");
       
       UsersManager user = new UsersManager();
       user.addCourses(users);
       
       
       
		
	}
	
	
}
