public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title){


        return new Book();

    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }

}
