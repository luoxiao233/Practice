
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
		System.out.println("�һ�ʲô");
	}
}
class C implements A{
	private B one;
	public C(B one){
		this.one = one;
	}
	public void O(){
		one.O();
		System.out.println("����һ��");
		System.out.println("�ֻ��˵�");
	}
}
