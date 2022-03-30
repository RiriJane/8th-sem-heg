package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("debut");
		int limit = 500000;
		double total = 0;
		for(int i=1;i< limit;i++)total = total + Math.log(i);

		System.out.println(total);
	}
}
