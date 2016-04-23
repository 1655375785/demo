package demo;

public class Master {
	public static void main(String[] args) {
		
	Dog myDog=new Dog();
	myDog.setName("Íú²Æ");
	//myDog.setName("Íú²Æ");
    myDog.setAge(3);
    String sound=myDog.bark();
    System.out.println(sound);
    myDog.eat();
    myDog.sleep();
    myDog.lookDoor();
    
	}
}
