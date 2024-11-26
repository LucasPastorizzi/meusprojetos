import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        PIS pis = new PIS();
        IPI ipi = new IPI();
        Pagamentos pag = new Pagamentos();

        Scanner leia = new Scanner(System.in);

        System.out.println("1-PAGAMENTOS /// 2-PIS  /// 3- IPI /// 4-SAIR");

        int continuar = leia.nextInt();

        while (continuar < 5) { 
            switch (continuar) {
                case 1:
                    System.out.println("VOCÊ ENTROU NA PARTE DE PAGAMENTOS");
                    System.out.println();

                    
                    String desejaContinuar = "S";
                    while (desejaContinuar.equalsIgnoreCase("S")) {
                        System.out.println("Deseja iniciar? (S/N)");
                        desejaContinuar = leia.next();

                        if (desejaContinuar.equalsIgnoreCase("S")) {
                            System.out.println("Qual tipo do imposto ?");
                            String tipoImposto = leia.next(); 
                            System.out.println("Qual o valor do imposto");
                            double valorImposto = leia.nextDouble(); 
                            System.out.println("Deseja continuar?? (S/N)");
                            desejaContinuar = leia.next(); 
                        }
                    }
                    break;

                case 2:
                    System.out.println("VOCE ENTROU NA PARTE DE PIS");
                    System.out.println();

                    
                    String desejaContinuarPis = "S";
                    while (desejaContinuarPis.equalsIgnoreCase("S")) {
                        System.out.println("Deseja iniciar? (S/N)");
                        desejaContinuarPis = leia.next();

                        if (desejaContinuarPis.equalsIgnoreCase("S")) {
                            pis.ExecutaFunc();
                            System.out.println("Deseja continuar?? (S/N)");
                            desejaContinuarPis = leia.next(); 
                        }
                    }
                    break;

                case 3:
                    System.out.println("VOCE ENTROU NA PARTE DE IPI ");
                    System.out.println();

                    
                    String desejaContinuarIpi = "S";
                    while (desejaContinuarIpi.equalsIgnoreCase("S")) {
                        System.out.println("Deseja iniciar? (S/N)");
                        desejaContinuarIpi = leia.next();

                        if (desejaContinuarIpi.equalsIgnoreCase("S")) {
                            ipi.ExecutarIpi();
                            System.out.println("Deseja continuar?? (S/N)");
                            desejaContinuarIpi = leia.next(); 
                        }
                    }
                    break;

                case 4:
                    System.out.println("ATÉ A PRÓXIMA");
                    break;
            }

            
            if (continuar != 4) {
                System.out.println("\n1-PAGAMENTOS /// 2-PIS  /// 3- IPI /// 4-SAIR");
                continuar = leia.nextInt(); 
            }
        }
    }
}
