package encapsulationGetSet;
 public class Student {

private int stId ;
private String stName;
private String stDob;


        public Student() {}//default constructor 
		public Student(int stId, String stName, String stDob) {// parametred constructor 
		
		this.stId = stId;//calling the private variables using this.
		this.stName = stName;//calling the private variables using this.
		this.stDob = stDob;//calling the private variables using this.
		}
		/*create automatically geters and seters: =>select the private variables => right button =>source => generate 
		 getters and setters. (the next six methods)  */
		public int getStId() {   //geter                       
		return stId;
		}
		public void setStId(int stId) {  //geter    
		this.stId = stId;                    
		}                                   
		public String getStName() {//geter 
		return stName;
		}
		public void setStName(String stName) {  //seter
		this.stName = stName;
		}
		public String getStDob() {//seter
		return stDob;
		}
		public void setStDob(String stDob) {//seter
		this.stDob = stDob;
		}
 }
