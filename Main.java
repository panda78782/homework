package chap12;


public class Main {

	public static void main(String[] args) {
		NamedRectangle nr =new NamedRectangle();
		//フィールドの継承
		nr.height=45;
		nr.width=67;
		System.out.println(nr.height);
		System.out.println(nr.width);
		//メソッドの継承
		nr.setSize(123,45);
		System.out.println(nr.getArea());
		//コンストラクタは継承されない

		Rectangle r=nr;
		System.out.println("-----");
		r.setSize(123, 45);
		 nr.setName("キョン");

	}

}
