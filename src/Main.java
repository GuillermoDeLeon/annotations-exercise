

@SuppressWarnings("deprecation")  //added this for easy_fix

public class Main {
//    @SuppressWarnings("all")
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) {
            System.out.println(book);
        }
    }
}
