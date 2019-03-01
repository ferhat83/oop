package polymorphism;

public class Overriding extends Overloading{
	public int areaOfLand(int a,int b) {
		int total= a+b;
		return total;
				}
	public int areaOfLand(int a,int b,int c) {
		int total= a+b+c;
		return total;
				}
	public int areaOfLand(int a,int b,int c,int d) {
		int total= a+b+c+d+1;// we add 1 to show the overriding  of the overloading class
		return total;
				}

}
