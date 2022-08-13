package lab2;

public class Test {

	public static void main(String[] args) {
		JournalPaper jp = new JournalPaper();
		Book book = new Book();
		
		jp.setId(1);
		jp.setAuthor("Ram");
		jp.setTitle("foo");
		
		System.out.println(jp);
		System.out.println(book);

	}

}
