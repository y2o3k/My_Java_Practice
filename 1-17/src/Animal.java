//동물클래스//
abstract class Animal {
	private String name; //이름 
	public Animal(String name) { this.name=name;} //생성자
	public abstract void bark();
	public String getName() {return name;}
}
