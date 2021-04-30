
public class Instructor extends Users{

		 String phoneNum;

		public Instructor(int id, String firstName, String lastName, String courses, String phoneNum) {
			super(id, firstName, lastName, courses);
			this.phoneNum = phoneNum;
		}
		public Instructor() {
			
		}
		public String getPhoneNum() {
			return phoneNum;
		}
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
}
