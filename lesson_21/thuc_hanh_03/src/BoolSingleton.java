public class BoolSingleton {
    private String author;
    private String title;
    private static BoolSingleton book;
    private static boolean isLoanedOut;

    private BoolSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BoolSingleton borrowBook() {
        if(!isLoanedOut) {
            if(book == null) {
                book = new BoolSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BoolSingleton bookReturned){
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
