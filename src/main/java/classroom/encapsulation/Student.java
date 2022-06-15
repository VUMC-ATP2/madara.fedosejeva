package classroom.encapsulation;

import lombok.*;

import java.time.Year;
import java.util.Calendar;

@ToString(callSuper = true)                        // ToString - tikai studdent fieldiem, ja "call super=true"-tad tiek izsaukti fieldi no Super-klases. Studentam var but fieldi no Studenta (child-clase)+Person (super-klase)
                                                   // Super-klasei " Person ari vajag anotaciju @ToString, jo caur call tikai tiek izsaukti, vajag izsaukt jau parveidotus.
@NoArgsConstructor                                 // anotacija, kas taisa klasee tukss konsuktrors (tas pats kas (Generate-Constructor) konsutrktors)
@AllArgsConstructor                                // anotacija, kas taisa visu field konstruktoru (tas pats, kas konstruktors) + "final" field NEIET uz konstruktoru
//@Builder                                         // anotacija - var izveidot sutdentu ar smuku method changing pieeju. nepabeidzam so
public class Student extends Person {

    @Getter                                             // anotacija - veido parasto getter prieks nakama fielda "garudationYear"
    public int graduationYear;
    private final String MAIL_DOMAIN = "@lu.lv";        // "private" - var redzet tikai seit KLASE --> PAREJAS KLASES NEZINA PAR TO // final - nekas nemainisiese, sis NEIES uz konstruktoru
    @Getter
    private String mail = "";

    public Student(String accountName) {                 // konsuktrors - kad veido stundetu, bus japadod account name.
        mail = accountName + MAIL_DOMAIN;                // madara.fed@lu.lv
    }


// Getter:                                                 // (labais clikc + Getter - nevajag, jo ieliku caur anotacijam "@Getter"
//    public String getMail() {
//        return mail;
//    }


// Setter:
    public void setMail(String mail) {
        if (this.mail.equals("@lu.lv") || this.mail.equals("")) {             // var mainit epastu, ja epasts ir tukss
            this.mail = mail;
        } else {
            System.out.printf("Your email is: %s and it IS correct one, and it will not be changed\n", this.mail);
        }
    }


    // Setter - if graduationYear is > 2022, then print message that Value cannot be set:
    public void setGraduationYear(int graduationYear) {
        int currentYear = Year.now().getValue();                                             // si gada ievadisana
        if (graduationYear > currentYear) {
            System.out.println("This value can not be set: " + graduationYear);
        } else {
            this.graduationYear = graduationYear;                                        // klases mainigais ir atjaunots - ar ievadito lielumu
        }
    }
}
