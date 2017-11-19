/**###09.12_面向对象(抽象类练习员工案例)
* A:案例演示
	* 假如我们在开发一个系统时需要对程序员类进行设计，程序员包括3个属性：姓名、工号及工资salary。Coder
	* 经理，除了含有程序员的属性外，另外还有一个奖金属性 bonus
	* 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
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
		System.out.println("天天敲代码"+ getName() + getNum());
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
		System.out.println("看你们敲代码" + getName() + getNum() + " qqqqqqqq" + getBonus());
	}
}
