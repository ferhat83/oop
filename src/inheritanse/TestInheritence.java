package inheritanse;

public class TestInheritence {

	public static void main(String[] args) {
		Father said = new Father();
		said.sport();
		System.out.println();
		
		Son ferhat = new Son();
		ferhat.sport();
		ferhat.soccer();
		System.out.println();
		
		Grandson ilina = new Grandson();
		ilina.sport();
		ilina.soccer();
		ilina.music();

	}

}
