public class Horistas extends Funcionarios {
    double hora ;
    double valorHora;
    public int porcentagem1 ;
    



    public void hrsTrab () {

        double soma = hora * valorHora;
        System.out.println(soma);
    }

    

    public void setHora(double hora) {
        this.hora = hora;
    }



    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    


    
}
