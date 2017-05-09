
public abstract class Entity {

	protected double x;
	protected double y;
	protected double volcity;
	
	protected int hp;
	protected String name;


	public abstract void update();
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getVolcity() {
		return volcity;
	}
	
	public void setVolcity(double volcity) {
		this.volcity = volcity;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
