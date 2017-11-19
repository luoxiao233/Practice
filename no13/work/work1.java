package work;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inter a = new Outer().new Inter();
		a.print();

	}

}

class Outer {
	private int num = 10;

	class Inter {
		public void print() {
			System.out.println(num);
		}
	}
}
