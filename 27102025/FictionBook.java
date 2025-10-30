public  class FictionBook extends Book  {
    private String genre;

    public FictionBook(String title, String author, boolean available, String borrowedBy, String genre) {
        super(title, author, available, borrowedBy);
        this.genre = genre;
    }
}
