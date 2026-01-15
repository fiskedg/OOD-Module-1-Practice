public abstract class LibraryMember {
    private int memberId; //An integer for the ID of a library member.
    private String memberName; //A String for the name of a library member.
    
    public abstract void borrowBook(Book book); //An abstract method for checking books out of the library. This will be implemented by the Student and Faculty subclasses.

    /**
     * This is the getter method for the ID of a library member.
     * @return an integer representing the ID of a library member.
     */
    public int getMemberID(){ 
        return this.memberId;
    }

    /**
     * This is the getter method for the name of a library member.
     * @return a string representing the name of a library member.
     */
    public String getMemberName(){
        return this.memberName;
    }
}

class Student extends LibraryMember{
    private int currentBorrow = 0; //An integer for the current number of books checked out by a library member.
    private int borrowLimit = 2; //An integer for the total number of books a library member can have checked out at a time.

    /**
     * This method checks out a new book for a student library member granted they have no more than two books.
     * @param book is the current book that the student wishes to check out.
     */
    @Override
    public void borrowBook(Book book){
        if(this.currentBorrow < borrowLimit){
            this.currentBorrow++;
            System.out.println("The current number of books you have borrowed is " + currentBorrow + ". Have a nice day!");
        }else{
            System.out.println("Sorry, you cannot borrow " + book + "as students cannot have more than two books borrowed.");
        }
    }

      /**
     * This method returns a book checked out by a student library member if they have a book currently checked out.
     */
    public void returnBook(){
        if(currentBorrow > 0){
            this.currentBorrow--;
            System.out.println("You have returned a book. The number of books you are currently borrowing is " + currentBorrow + ".");
        }else{
            System.out.println("You have no books that are borrowed.");
        }
    }

     /**
     * This is the getter method for how many books a student library member currently has checked out.
     * @return an integer representing the total number of books a student library member has checked out.
     */
    public int getCurrentBorrow(){
        return this.currentBorrow;
    }

    /**
     * This is the getter method for how many books a student library member can check out.
     * @return an integer representing the total number of books a student library member can check out.
     */
    public int getBorrowLimit(){
        return this.borrowLimit;
    }

    /**
     * This is the setter method for how many books a student library member currently has checked out.
     * This takes the current number of books borrowed and sets it to the parameter value.
     */
    public void setCurrentBorrow(int currentBorrow){
        this.currentBorrow = currentBorrow;
    }
}
class Faculty extends LibraryMember{
    private int currentBorrow = 0;
    private int borrowLimit = 5;

    /**
     * This method checks out a new book for a faculty library member granted they have no more than five books.
     * @param book is the current book that the student wishes to check out.
     */
    @Override
    public void borrowBook(Book book){
        if(this.currentBorrow < borrowLimit){
            this.currentBorrow++;
            System.out.println("The current number of books you have borrowed is " + currentBorrow + ". Have a nice day!");
        }else{
            System.out.println("Sorry, you cannot borrow " + book + "as faculty cannot have more than five books borrowed.");
        }
    }

    /**
     * This method returns a book checked out by a faculty library member if they have a book currently checked out.
     */
    public void returnBook(){
        if(currentBorrow > 0){
            this.currentBorrow--;
            System.out.println("You have returned a book. The number of books you are currently borrowing is " + currentBorrow + ".");
        }else{
            System.out.println("You have no books that are borrowed.");
        }
    }

    /**
     * This is the getter method for how many books a faculty library member currently has checked out.
     * @return an integer representing the total number of books a faculty library member has checked out.
     */
    public int getCurrentBorrow(){
        return this.currentBorrow;
    }

    /**
     * This is the getter method for how many books a faculty library member can check out.
     * @return an integer representing the total number of books a faculty library member can check out.
     */
    public int getBorrowLimit(){
        return this.borrowLimit;
    }

     /**
     * This is the setter method for how many books a faculty library member currently has checked out.
     * This takes the current number of books borrowed and sets it to the parameter value.
     */
    public void setCurrentBorrow(int currentBorrow){
        this.currentBorrow = currentBorrow;
    }
}