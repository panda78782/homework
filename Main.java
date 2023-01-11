package chap12;


public class Main {

	public static void main(String[] args) {
		NamedRectangle nr =new NamedRectangle();
		Rectangle r=nr;
		System.out.println("-----");
		r.setSize(123, 45);
		nr.setName("キョン");
		
	}

}
