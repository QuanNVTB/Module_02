public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedout;

    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedout = false;
    }

    //method mượn sách
    public static BookSingleton borrowBook(){
        if(!isLoanedout){
            if(book == null){
                book = new BookSingleton();
            }
            isLoanedout = true;
            return book;
        }
        return null;
    }

    //method trả sách
    public void returnBook(BookSingleton bookReturnes){
        isLoanedout = false;

    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
