package practise;

public class StaticBlockExecution {

	static {
		StaticBlockExecution sbe = new StaticBlockExecution();
		sbe.m1();
		m2();
	}

	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("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");
	}
	void m1() {
		System.out.println("HII");
	}
	static void m2() {
		System.out.println("HLO");
	}

}
