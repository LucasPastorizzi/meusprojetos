import java.util.Scanner;

public class PIS {

    private double valorDe;
    private double  valorCre ;
   
    
    
    public PIS() {
    }

    public void ExecutaFunc () {


        Scanner leia = new Scanner(System.in);

        System.out.println("valor de débito; ");
        System.out.println("valor de Crédito; ");
        valorDe = leia.nextDouble();
        valorCre = leia.nextDouble();

       
        double SomaImposto = (valorDe - valorCre) * 0.0165 ;
        System.out.println("VALOR FINAL SERÁ DE ; " + SomaImposto);


    }

    public double getValorDe() {
        return valorDe;
    }

    public void setValorDe(double valorDe) {
        this.valorDe = valorDe;
    }

    public double getValorCre() {
        return valorCre;
    }

    public void setValorCre(double valorCre) {
        this.valorCre = valorCre;
    }
    
}
