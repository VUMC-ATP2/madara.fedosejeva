package classroom;

public class House {
// jauna klase
    int houseNumber = 69;  //lauks housenumber
    String propertyType = "bla";
    byte stories = 3;
    int bedrooms = 4;
    int year = 1999;
    double marketValue = 1000000;

//        int houseNumber = 69;  //lauks housenumber
//    String propertyType = "bla";
//    byte stories;
//    int bedrooms;
//    double marketValue;

            public void printInformation() {  //House klases metode "printInformation"
            System.out.println("House number: " + houseNumber);
            System.out.println("Property type: " + propertyType);
        }


        public boolean isHouseOld() {
                boolean isOld;  // ieviesu jaunu mainigo "isOld"
                if (year < 2000) {
                    System.out.println("Old house");
                    isOld = true;
                } else {
                    System.out.println("New house");
                    isOld = false;
                }
                return isOld;
        }

}
