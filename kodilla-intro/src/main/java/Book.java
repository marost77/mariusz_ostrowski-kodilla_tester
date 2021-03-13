public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title){
        Book book = new Book(author, title);

        return book;

    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Book.of("Isaac Asimov", "The Galaxy"));
    }


}
