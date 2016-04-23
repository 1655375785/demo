package demo;

public class Pet {
	private String Name;
	private int Age;
	private String king;
	public String bark(){
		return "ÍôÍô";
	}
	public void eat(){
		System.out.println("³Ô·¹");
	}
	public void sleep(){
		System.out.println(Name+"ÔÚË¯¾õ");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge(int Age) {
		
		return Age;
	}
	public void setAge(int age) {
		if (Age>20||Age<0) {
			System.out.println("Êý¾Ý´íÎó");
		}
		else
			this.Age=Age;
	}
	public String getKing() {
		return king;
	}
	public void setKing(String king) {
		this.king = king;
	}
}
