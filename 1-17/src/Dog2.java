//개2 
class Dog2 extends Animal2 {
	private String type;
	public Dog2(String name,String type ) {
		super(name); this.type = type ; 
	
	}
	public void  bark() {System.out.println("멍멍!");} //짖기 
	public String toString() {
		return type + "의" + getName();
		}
}
