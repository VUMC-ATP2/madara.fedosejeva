package classroom.objects;

public class Circle {

    final double PI = 3.14; // PI ar lieliel burtiem, jo PI vertiba = constant
    double circleRadius;  //definets jauns mainigais  (SEIT)


    public double circleArea(double radius) { //si metode neaizpilda ŗadiu"mainigo. tas NAV klases radius, tas ir metdoes radius. radiius atnak no metdoes
        circleRadius = PI * (radius * radius);
        return circleRadius;  //lai saglaba radius prieks visas klases!!!!

//        return this.radius = PI * (radius * radius);  //this.radius = PI * (radius * radius); --> lai pieskirtu klases radiusam vertibu (SEIT)
// this.radius - pieder klases radiusam


        //otrs variants: return PI * (radius * radius)
    }

}


