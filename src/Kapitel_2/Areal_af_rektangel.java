package Kapitel_2;
import java.util.Scanner;

public class Areal_af_rektangel {
    public static void main(String[] args) {
        System.out.print("Input arealet af side 1:  ");
        Scanner input = new Scanner(System.in);
        int Linput1 = Integer.parseInt(input.next());
        System.out.print("Input arealet af side 2:  ");
        Scanner input2 = new Scanner(System.in);
        int Linput2 =  Integer.parseInt(input.next());

        System.out.println("Aralet af rektangel med sider 2 og 5 er  " + Beregner(Linput1,Linput2));
        System.out.println("Aralet af rektangel med sider 6 og 12 er  " + Beregner(6,12));
    }

    public static int Beregner(int længde1 , int længde2)  {

    return længde1 * længde2 ;
    }

}
