
public class ZhuangShi_mode {

	public static void main(String[] args) {
		C two = new C(new B());
		two.O();
	}

}
interface A{
	public void O();
}
class B implements A{
	public void O(){
		System.out.println("我会什么");
	}
}
class C implements A{
	private B one;
	public C(B one){
		this.one = one;
	}
	public void O(){
		one.O();
		System.out.println("会了一点");
		System.out.println("又会了点");
	}
}
