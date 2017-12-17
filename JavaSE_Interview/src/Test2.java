
public class Test2 {
/*
 * staticµÄ¿¼µã
 */
	public static void main(String[] args) {
		As<Integer> a1 = new As<Integer>();
		a1.var = 1;
		As<String> a2 = new As<String>();
		a2.var = 3;
		As<Character> a3 = new As<Character>();
		a3.var = 2;
		System.out.println(a1.var);
		System.out.println(a2.var);
		System.out.println(a3.var);
		System.out.println(As.var);
	}

}
class As<T>{
	public static int var = 0 ;
}
