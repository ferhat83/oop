package singleton;

public class DatabasLicense {

/* 3 steps to make a singlton class:
 *          1- create one  static instance (object)
 *          2- private constructor (don't allow to create more instance)    
 *          3- static method to get the single instance(object),                        
 */
	private DatabasLicense() {}// private constructor private to not be accessibal from other classes
	
	public static DatabasLicense getInstance() {//static method to get the single instance(object)
	DatabasLicense dbLicens = new DatabasLicense();//static instance (object)
	 return dbLicens;
	}
	public void databaseFeatures() {
		System.out.println(" we have SQL database features");
	}
	 
}   // more ex in the next package.