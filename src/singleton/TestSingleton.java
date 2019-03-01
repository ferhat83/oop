package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		DatabasLicense db1 = DatabasLicense.getInstance();
		db1.databaseFeatures();

	}

}
