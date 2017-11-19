class Demo8_Employee{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("张三");
		e.setId("9527");
		e.setSalary(9999);
		e.work();
		Employee e1 = new Employee("王五","007",1);
		e1.work();
	}
}
class Employee {
	private String name;
	private String id;
	private double salary;

	public Employee(){}
	public Employee(String name,String id,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	public void work(){
		System.out.println(name + "的工号" + id + "，工资" + salary);
	}
}
