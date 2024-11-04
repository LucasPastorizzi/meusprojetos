import java.util.Scanner;

public class MainCartao {
    

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);


        System.out.println("O seu cartão é de debito ou de credito? \n ");
        String escolha = leia.nextLine();
        if (escolha == "debito") {
            Cdebito dcartao1 = new Cdebito();

            
        }
      
        System.out.println("Agora informe o numero do cartao \n ");
        float valor = leia.nextFloat();

        dcartao1.valor = 1000;

        

        
    }
    
}
