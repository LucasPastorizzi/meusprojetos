
public class Assalariados  extends Funcionarios {

   private double salarioMensal;
   public  int porcentagem ;
   public double somaporcetagem = 0;
   private  double allaumento ;


   public void aumtTds () {

      double somaGeralAum =  ( salarioMensal * allaumento) / 100 + salarioMensal ;
      System.out.println(somaGeralAum);

   }
  

public void CalcPorcentagem () {

    somaporcetagem =  ( salarioMensal * porcentagem) / 100 + salarioMensal + somaporcetagem;

   System.out.println("O valor com aumento foi : " + somaporcetagem);
   
}





   public void setAllaumento(double allaumento) {
   this.allaumento = allaumento;
}


   public void setPorcentagem(int porcentagem) {
   this.porcentagem = porcentagem;
}










   public void infsalario () {
   
       System.out.println("O total a receber será " + salarioMensal);


       
   }





   public double getSalarioMensal() {
      return salarioMensal;
   }



   public void setSalarioMensal(double salarioMensal) {
      this.salarioMensal = salarioMensal;
   }
}