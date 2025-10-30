public abstract class Book implements BookOperations{
    private String title;
    private String author;
    private boolean available;
    private String borrowedBy;

    public Book(String title, String author, boolean available, String borrowedBy) {
        this.title = title;
        this.author = author;
        this.available = true;
        this.borrowedBy = borrowedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public void borrowBook(String user) {
        if (isAvailable()) {
            setBorrowedBy(user);
            setAvailable(false);
        } else {
            System.out.println("This book is not available");
        }

    }

    @Override
    public void returnBook() {
        setBorrowedBy(null);
        setAvailable(true);
    }

    void displayInfo(){
        System.out.println("Title: " + getTitle() + "\n Author: " + getAuthor() + "\n Availability: " + (isAvailable() ? "Available" : "not available"));
    }
}
