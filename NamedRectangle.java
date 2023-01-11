package chap12;

public class NamedRectangle extends Rectangle{//サブクラス名extendsスーパークラス名
	String name;
	
	NamedRectangle(){
		//各コンストラクタの一行目にスーパークラスの引数なしコンストラクタ呼び出しが挿入される
		//super();
		this("NO NAME");
	}
	NamedRectangle(String name){
		super(200,32);
		this.name=name;
	}
	
	@Override
	void setSize(int w, int h) {
		width = w;
		height = h;
		System.err.println("サブクラスのsetSize");
	}
	void setName(String name) {
		this.name=name;
	}
}



