package classroom.encapsulation;

public class Example {
    public static void main(String[] args) { //kad strada ar objektiem executable mode, tad strada ar main metodi.

        Student madara = new Student("madara.fedosejeva");
        System.out.println(madara.getMail());             // epasta dabusana ar  metodi "Getter"

        madara.setMail("jauns.epasts@lu.lv");           // mainit mainigo vertibu caur metodi " Setter" ir smukak, neka caur objektu
//      madara.mail = "samainits.epasts@lu.lv";         // mainit mainigo caur klases objektu "madadra" - tikai tad, ja mail = public. bet sadi NAV SMUKI, jo Tiek pieprasits klases mainigais

        madara.setName("Madara");
        madara.setLastname("Fedosejeva");
        madara.setHasMood(true);
        System.out.println(madara);                       // kamer nav klasee "Student" anotacijas "@ToString", printes references kodu


        Student zanna = new Student("");                                // epasta samainisana tuksam studenta epastam
        System.out.println("Zannas epasts bez accountName: " + zanna.getMail());
        zanna.setMail("blabla");                                                    // nedrukas neko
        System.out.println("Zannas NEW email: " + zanna.getMail());
        zanna.setMail("zanna@lu.lv");                                               // izdruka "Your email is: %s and it IS correct one, and it will not be changed"
        System.out.println("Zana email is still the same: " + zanna.getMail());
        zanna.setMail("zanna2@lu.lv");


        // set graduation year 2023
        zanna.setGraduationYear(2023);                                         // ielieku vertibu --> Izdrukaa, ka "This value can not be set"
        System.out.println(zanna.getGraduationYear());                         // dabuju vertibu --> zdrukaa, ka graduation year is 0, jo nav ielikts

        // example class --> setter: set graduation Year to 2020, get it and print it
        zanna.setGraduationYear(2020);
        System.out.println(zanna.getGraduationYear());


        //builder izmantosana:
//        Student anna = Student.builder().




    }
}
