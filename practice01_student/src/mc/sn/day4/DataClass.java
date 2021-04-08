package mc.sn.day4;

public class DataClass {
	
		private String name;
		private String sex;
	
		DataClass(String name, String sex){
			this.name = name;
			this.sex = sex;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		private void setSex(String sex) {
			this.sex =sex;
		}
		public String getName() {
			return this.name;
		}
		public String getSex() {
			return this.sex;
		}
		
		
		public void who() {
			System.out.println(name+", "+sex);
		}
//		public static void main(String[] args) {
//		DataClass dc = new DataClass("Lee","m");
//		dc.who();
//		}
}
