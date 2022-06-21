package classroom.practice_encapsul_polymorph;

import lombok.*;

@AllArgsConstructor
@ToString
@Builder

public class Book {
    @Getter
    public String isbn;
    @Getter
    public String name;
    @Getter @Setter
    public double price;
    @Getter @Setter
    public int qty = 0;
    Author author;                                // veidojot jaunu book klasi, bus pieejams autors, bet, lai butu pieejams Autors, jataisa Getter


// Getter, kas atgriez autora vardus no Book klases (prieks "Author author"?)
    public String getAuthor() {
        return author.getName();
    }

// konstruktors:
    public Book(String isbn, String name, int qty, Author author) {      // Book klase pienem kaa parametru "Author" objektu - ieksa gramata liek info par autoru
        this.isbn = isbn;
        this.name = name;
        this.qty = qty;
        this.author = author;
    }



}
