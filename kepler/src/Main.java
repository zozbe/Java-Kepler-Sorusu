import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("a degeriniz giriniz ");
        double a=input.nextDouble();
        System.out.println("b degerini giriniz");
        double b=input.nextDouble();
        System.out.println("aci degerini giriniz");
        double aci=input.nextDouble();

        kepler1 kepler=new kepler1(a,b,aci);
        kepler.yazdir();




    }
}