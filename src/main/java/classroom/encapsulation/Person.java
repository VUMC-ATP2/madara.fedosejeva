package classroom.encapsulation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "lastname")
//@Builder

public class Person {
    protected String name = "John";       // definets / inicializets name " John"
    protected String lastname = "Doe";
    private boolean hasMood;
    // Protected - Class, Package, Subclass ( klase, kas manto visu no Person/extends)
}
