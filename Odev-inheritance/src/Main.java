
public class Main {

	public static void main(String[] args) {
	
		System.out.println("--- öğrenci bilgisi ---");
		Student student = new Student();
		student.setId(1);
		student.setFirstName("kadriye nur");
		student.setLastName("Nalbant");
		student.setCourses("Java-React-Kursu");
		student.setCompletionRate("%50 tamamlandı");
		student.setAdress("konya / Türkiye");
		
		StudentManager studentManager= new StudentManager();
		studentManager.completionRate(student);
		studentManager.addAdress(student);
		
		
       System.out.println("--- Eğitmen bilgileri ---");
       
       Instructor instructor = new Instructor();
       instructor.setId(1);
       instructor.setFirstName("Engin");
       instructor.setLastName("Demiroğ");
       instructor.setPhoneNum("05551112323");
       
       InstructorManager instructorManager = new InstructorManager();
       instructorManager.addPhoneNum(instructor);
       
       
       System.out.println("---Kullanıcı bilgileri---");
       
       Users users = new Users();
       users.setId(2);
       users.setFirstName("kulllanıcı");
       users.setLastName("kullanıcı");
       users.setCourses("c# angular");
       
       UsersManager user = new UsersManager();
       user.addCourses(users);
       
       
       
		
	}
	
	
}
