package chap12;

public class NamedRectangle extends Rectangle{//サブクラス名extendsスーパークラス名
	String name;
	
	NamedRectangle(){
		//各コンストラクタの一行目にスーパークラスの引数なしコンストラクタ呼び出しが挿入される
		//super();
		this("NO NAME");//自分のコンストラクタの明示的な呼び出し
	}
	NamedRectangle(String name){
		super(200,32);//スーパークラスの明示的なコンストラクタ呼び出し

		this.name=name;//自分のコンストラクタの明示的な呼び出し
	}
	
	/*Overrideはスーパークラスのメソッドを変更するために使う
	* スーパークラスで宣言されたメソッドの内容をサブクラス側で無効にし新たな宣言を行う*/
	@Override
	void setSize(int w, int h) {
		width = w;
		height = h;
		//System.out.println("サブクラスのsetSize");
	}
	void setName(String name) {

		this.name=name;
	}
}



