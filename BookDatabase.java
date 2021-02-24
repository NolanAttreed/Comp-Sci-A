import java.util.Scanner;
public class BookDatabase {
	public void addBook() {
		Scanner enter = new Scanner(System.in);
		int x = 1;
		int n = 0;
		while(x > 0) {
			System.out.println("Please enter a book.");
			System.out.println("What is the book's title?");
			String title = enter.nextLine();
			System.out.println("Who is the author?");
			String author = enter.nextLine();
			System.out.println("What is the genre?");
			String genre = enter.nextLine();
			System.out.println("How many pages are in the book?");
			int pages = enter.nextInt();
			n++;
			System.out.println("Would you like to enter another book? 1- yes 2- no");
			int a = enter.nextInt();
			enter.nextLine();
			if(a == 1) {
				x = 1;
			}
			else {
				x = 0;
			}
		}
		System.out.println("There is currently " + n + " books entered in the database.");
		enter.close();
	}


}
