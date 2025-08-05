public class BookBorrower {
    private BoolSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowedBook = BoolSingleton.borrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else{
            haveBook = true;
        }
    }

    public String getAuthorAndTitle() {
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }


}
