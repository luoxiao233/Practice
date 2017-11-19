class Test1{
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "ÂíÔÆ";
		Person p1 = new Person();
		p1.setName("Ð¡Íõ");
		System.out.println(p.name + p.nation);
		p1.setNation("as");
		System.out.println(p1.nation);
	}
}
class Person {
	String name;
	static String nation = "china";
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return name;
	}
	public void setNation(String a){
		this.nation = a;
	}
}
