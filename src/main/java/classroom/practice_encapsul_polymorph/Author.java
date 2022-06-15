package classroom.practice_encapsul_polymorph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Author {
    public String name;
    @Setter
    public String email;

}
