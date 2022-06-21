package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Customer {
    @Getter
    private String name;
    @Setter
    private boolean isMember;
    @Getter
    @Setter
    private String memberType;


    public Customer(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return isMember;
    }
}
