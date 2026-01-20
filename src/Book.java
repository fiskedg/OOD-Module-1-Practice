public class Book {
    private int bookId;
    private String title;
    private String author;
    private int edition;
    private int copiesAvailable;
    
    public Book(int bookId, String title, String author, int edition, int copiesAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.edition=edition;
        this.copiesAvailable=copiesAvailable;
    }

    public void showDetails(){
        System.out.println(bookId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(edition);
        System.out.println(copiesAvailable);
    }

    public int getCopiesAvailable(){
        return copiesAvailable;
    }
}
