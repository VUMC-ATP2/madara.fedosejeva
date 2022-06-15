package classroom.practice_encapsul_polymorph;

public class Example {
    public static void main(String[] args) {

// (1) variants: (ar pre-defined object)
        Author author = new Author("Margarita Staraste", "margaria@gmail.com");
        Book Ziluks = new Book("123", "Ziluks un draugi", 10.3, 10, author);

// (2) variants: sadi labak  (liek konstruktora ieksa objektu)
        Book ZiluksUnDraugi = new Book("123", "Ziluks un draugi", 10.3, 10, new Author("Margarita Staraste", "margarita@gmail.com"));

        System.out.println(Ziluks);
        System.out.println("Book author is: " + Ziluks.getAuthor());       // gramatai tiek prasits autora vards, nevis autoram autora vards

        // @Builder annotation created Builder for Book class
        Book builderBook = Book.builder()
                .name("Harry Potter and the Deathly Hallows")
                .isbn("9780939173570")
                .price(60.00)
                .qty(10)
                .author(author).build();

        System.out.println(builderBook);
    }
}
