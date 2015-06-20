package database.access.facade;

public interface DatabaseFacade {
	public void insert();
	public void update();
	public void remove();
	public void find();
	public void find(String id);
}
