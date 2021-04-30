
public class Student extends Users{

		 String completionRate;
		 String adress;
		public Student(int id, String firstName, String lastName, String courses, String completionRate, String adress) {
			super(id, firstName, lastName, courses);
			this.completionRate = completionRate;
			this.adress = adress;
			
				}
		public Student() {
			
		}
		public String getCompletionRate() {
			return completionRate;
		}
		public void setCompletionRate(String completionRate) {
			this.completionRate = completionRate;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}

}

