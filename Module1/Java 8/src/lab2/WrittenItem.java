package lab2;

public abstract class WrittenItem extends Item {
	private String author;
	
	public WrittenItem() {
	}
	
	public WrittenItem(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}
	
}
