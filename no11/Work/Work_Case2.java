/**###09.12_�������(��������ϰԱ������)
* A:������ʾ
	* ���������ڿ���һ��ϵͳʱ��Ҫ�Գ���Ա�������ƣ�����Ա����3�����ԣ����������ż�����salary��Coder
	* �������˺��г���Ա�������⣬���⻹��һ���������� bonus
	* ��ʹ�ü̳е�˼����Ƴ�����Ա��;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
*/
class Work_Case2{
	public static void main(String[] args) {
		Person p = new Coder("haha","007",8);
		p.work();

		Person p1 = new Manager("xiao","9527",20,200);
		p1.work();
	}
}
abstract class Person {
	private String name;
	private String num;
	private double salary;
	public Person(){}
	public Person(String name,String num,double salary){
		this.name = name;
		this.num = num;
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNum(String num){
		this.num = num;
	}
	public String getNum(){
		return num;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	abstract public void work();
}
class Coder extends Person{
	public Coder(){}
	public Coder(String name,String num,double salary){
		super(name,num,salary);
	}
	public void work(){
		System.out.println("�����ô���"+ getName() + getNum());
	}
}
class Manager extends Person{
	private double bonus;
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	public double getBonus(){
		return bonus;
	} 
	public Manager(){}
	public Manager(String name,String num,double salary,double bonus){
		super(name,num,salary);
		this.bonus = bonus;
	}
	public void work(){
		System.out.println("�������ô���" + getName() + getNum() + " qqqqqqqq" + getBonus());
	}
}
