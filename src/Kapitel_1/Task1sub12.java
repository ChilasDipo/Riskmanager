package Kapitel_1;

public class Task1sub12 {
    public static void main(String[] args) {
        double distance = 1.6*24 ;
        //udregner afstanden i kilimeter
        double timeinhour = (1.0+(40.0/60.0)+(35.0/3600.0));
        //beregner tidens som det tager i timer
        System.out.println(distance/timeinhour + " " +"km/t");
        // printer distancen over tiden ud for at give aftanden
        System.out.println(timeinhour +  " " +"timer");
        System.out.println(distance + " " + "km");
    }
}
