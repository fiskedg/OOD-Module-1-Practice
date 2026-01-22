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
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Edition: " + this.edition);
        System.out.println("Copies Available: " + this.copiesAvailable);
    }

    public int getCopiesAvailable(){
        return this.copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable){
        this.copiesAvailable = copiesAvailable;
    }
}
