package practise;

public class StaticBlockExecution {

	static {
		StaticBlockExecution sbe = new StaticBlockExecution();
		sbe.m1();
		m2();
	}

	{
		System.out.println("Hell");
	}

	public static void main(String[] args) {

	}
	void m1() {
		System.out.println("HII");
	}
	static void m2() {
		System.out.println("HLO");
	}

}
