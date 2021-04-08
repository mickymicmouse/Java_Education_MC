package mc.sn.practice;

public abstract class Shape {
	
	private String info;
	public Shape(){
		
	}
	public Shape(String info) {
		this.info = info;
	}
	public abstract void draw();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.info;
	}
}
