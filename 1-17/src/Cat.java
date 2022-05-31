//고양이 클래스 (ver1)//
public class Cat extends Animal{
	private int age;
	public Cat(String name, int age) {
		super(name); this.age =age;
	}
	public void bark() {System.out.println("냐옹!");}; //짖기
}
