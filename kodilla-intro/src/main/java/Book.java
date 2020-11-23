public class Book {
    private String author;
    private String title;

    public static String of(String author, String title){
        String book = (author +" "+ title);

        return book;

    }

    public static void main(String[] args) {
        String someBook = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(someBook);

    }

}
