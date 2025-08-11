import java.sql.SQLOutput;

public class kepler1 {

    double a;
    double b;
    double aci;

    kepler1(double a, double b, double aci){

        this.a= a;
        this.b=b;
        this.aci=aci;

    }

    double Eksentri(){

        double e= Math.sqrt(1-Math.pow((b/a),2));
        return e;


    }

    double Polar(){
        double e=Eksentri();
        double r= (a*(1-Math.pow(e,2))/(1+e*Math.cos(Math.toRadians(aci))));
        return r;

    }

void yazdir(){
double e= Eksentri();
double r= Polar();
    System.out.println("Girdiginiz e degeri "+e);
    System.out.println("Buldugunuz r degeri"+r);
}

}
