package chap12;

class Rectangle {
	int width;
	int height;
	
	Rectangle(){
		setSize(10,20);
	}
	
	Rectangle(int w, int h) {
		setSize(w,h);
	}
	
	void setSize(int w, int h) {
		width = w;
		height = h;
		System.err.println("スーパークラスのsetSize");
	}
	
	int getArea() {
		return width * height;
	}
	
	@Override
	public String toString() {
		return "[ width = " + width + ", height = " + height + " ]";
	}
}
