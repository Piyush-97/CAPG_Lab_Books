package lab2;

public abstract class Item {
	private int id;
	private String title;
	private int numberOfCopies;
	
	public Item(int id, String title, int numberOfCopies) {
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	
	public Item() {
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numberOfCopies=" + numberOfCopies + "]";
	}
	
}
