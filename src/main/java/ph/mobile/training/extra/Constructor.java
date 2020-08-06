package ph.mobile.training.extra;
public class Constructor {


    protected static class Author {
        String firstName;
        String lastName;
        Author(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;

        }
    }

    protected static class Book {
        String title;
        double price;

        Book(String title, double price){
            this.title = title;
            this.price = price;
        }
    }


    public static void main(String[] args) {

        Book book = new Book("Libro ni hudas", 500.00 );
        Author author = new Author("Winky", "Dionisio");
        System.out.println("Book: "+ book.title);
        System.out.println("Author: "+ author.firstName+" "+ author.lastName);
        System.out.println("Price: "+ book.price);
    }
}
