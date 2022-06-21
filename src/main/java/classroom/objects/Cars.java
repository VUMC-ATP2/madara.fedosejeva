package classroom.objects;

public class Cars {  // klase ir templeits, sablons nakotnes OBJEKTAM

    int doorCount;  //klases mainigie
    int tyres = 4;
    int productionYear;
    int mileage;
    String color;
    String brand;
    boolean piekabesAkis;

    //metode, kas pienem visus parametrus un tos aizpilda
    // Dati tiek aizpilditi caur metodi
//    public void fillHalfCarData(String carBrand, String carColor) {
//        //kaa savienot kalses mainigos ar mainigos no metodes:
//        brand = carBrand;
//        color = carColor;
//        System.out.println("Info updated");

 // CAUR METODI: tiek aizpildits BRAND un COLOR:
        public void fillHalfCarData(String brand, String color) {
            //kaa savienot kalses mainigos ar mainigos no metodes:
            this.brand = brand;     //brand = brand;  --> sadi nevar, TADEL RAKSTA: this.brand (no KLASES) = brand (no METODES).
            this.color = color;
            System.out.println("Info updated through method (fillHalfCarData)");
    }


// (2) PARAMETRIZETS KONSTRUKTORS (lidzigs, kaa metode "fillHalfCarData"):
    public Cars(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

// (2) PARAMETRIZETS KONSTRUKTORS (lidzigs, kaa metode "fillHalfCarData"):
    public Cars(int doorCount, int tyres, int productionYear, int mileage, String color, String brand, boolean piekabesAkis) {
        this.doorCount = doorCount;
        this.tyres = tyres;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
        this.piekabesAkis = piekabesAkis;
    }


    // (1) NO-ARG KONSTRUKTORS - tiek nodefinetas darbibas, kas notiks, ja tiks uztaisits jauns klases objekts
    public Cars() {
        System.out.println(" Car object is created! New one :)))");
    }

// lai normali izprintet METODE: System.out.println(alfaRomeo): Generate --> toString
    @Override
    public String toString() {
        return "Cars{" +
                "doorCount=" + doorCount +
                ", tyres=" + tyres +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", piekabesAkis=" + piekabesAkis +
                '}';
    }
}
