//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower borrowedBook1 = new BookBorrower();
        BookBorrower borrowedBook2 = new BookBorrower();

        borrowedBook1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(borrowedBook1.getAuthorAndTitle());

        borrowedBook2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(borrowedBook2.getAuthorAndTitle());

        borrowedBook1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        borrowedBook2.borrowBook();
        System.out.println("BookBorrower2 Aithor and Title: ");
        System.out.println(borrowedBook2.getAuthorAndTitle());

        System.out.println("End testing singleton PATTERN");
    }
}