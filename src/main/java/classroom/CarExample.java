package classroom;

public class CarExample {

    public static void main(String[] args) {

        Cars bmw = new Cars();  // Tiek izveidots jauns objekts. pieeja visiem Car klases mainigajiem un metodem
        System.out.println(bmw);  // izdruka objekta referenci (
// (1) dati tiek aizpilditi AR ROKU - sanak VAIRAKAS rindas, neka caur konstruktoru
        bmw.brand = "BMW";
        bmw.color = "black";


// (2) Dati tiek aizpilditi caur metodi - SADI LABAK, neka (1)!!!!!
        Cars audi = new Cars();  // veidoju JAUNU objektu + izpildies no-arg konstruktors
        System.out.println("color of my car is " + audi.color);  // NAV krasas
        audi.fillHalfCarData("Audi", "blue");
        System.out.println("color of my car is " + audi.color);  // BLUE


// (3) Dati tiek aizpiditi caur konstruktoru UZREIZ: Tiek veidos jauns objekts, caur kuru ar konstruktora palidzibu ierakstu PARAMETRUS - color, brand
        Cars jaguar = new Cars("red", "Jaguar");   // tagad NEIZPILDISIES TUKSAIS KONSTRUKTORS
        System.out.println(jaguar.color);
        System.out.println(jaguar.brand);


        Cars alfaRomeo = new Cars(4, 4, 2000, 1999, "red", "Alfa Romeo", true);
//        alfaRomeo.piekabesAkis = true; // sadi ar roku pierakstit klat
        System.out.println(alfaRomeo);


// --> var izvleleties, vai taisa jaunu tuksu objektu, vai obligati ar parametriem
// Tuksa konstruktora izmantosana:
        Cars skoda = new Cars();  // tagad IZPILDISIES TUKSAIS KONSTRUKTORS. Bet, ja iznem lauka no-Arg konstruktoru, tad NEVAR UZTAISIT TUKSU OBJEKTU!!!
        skoda.doorCount = 6;  // pati ielieku vertibas
        skoda.color = "aqua";

    }
}
