package lab2;

public class JournalPaper extends WrittenItem {
	private int yearPublished;
	
	public JournalPaper() {
	}
	
	public JournalPaper(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [YearPublished=" + yearPublished + ", Author=" + getAuthor() + ", Id=" + getId()
				+ ", Title=" + getTitle() + ", NumberOfCopies=" + getNumberOfCopies() + "]";
	}

	
}