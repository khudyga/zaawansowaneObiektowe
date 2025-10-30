public class AcademicBook extends Book{
    String field;

    public AcademicBook(String title, String author, boolean available, String borrowedBy, String field) {
        super(title, author, available, borrowedBy);
        this.field = field;
    }
}
