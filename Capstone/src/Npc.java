
public class Npc extends Entity {

	public AI ai;

	@Override
	public void update() { 
		ai.execute();
		
	}
	
	
}
