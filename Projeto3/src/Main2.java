import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main2 {

    public static void main(String[] args) {
          Scanner leia = new Scanner(System.in);
            Horistas h = new Horistas();

            Assalariados a = new Assalariados();

         


                List<Funcionarios> funcionarios = new ArrayList<>();
                int maxfuncionarios = 10;   


                for (int i = 0 ; i < 10 ; i++) {

                    System.out.println("1- ASSALARIADO ///// 2- HORISTA");
                    int escolha = leia.nextInt();

                System.out.println("Nome;");
                String nome = leia.next();

                System.out.println("CPF:");
                int cpf = leia.nextInt();
                

                
                System.out.println("endereço;");
                String endereco = leia.next();
                


                System.out.println("telefone:");
                int telefone = leia.nextInt();
                

                System.out.println("setor");
                String setor = leia.next();

                if (escolha == 1) {
                    System.out.println("Qual seu salário?");
                    double salarioMensal = leia.nextDouble();

                    a.setSalarioMensal(salarioMensal);
                    a.infsalario();
                    System.out.println("Informe um aumento ( EM PORCENTAGEM )");
                    int porcentagem = leia.nextInt();
                    a.setPorcentagem(porcentagem);
                    a.CalcPorcentagem();
                    System.out.println("///////////////////////////////////////////////////////////////////");



                }else if (escolha == 2) {
                    System.out.println("Horas trampadas?");
                    double hora = leia.nextDouble();
                    h.setHora(hora);

                    System.out.println("Valor da hora");
                    double valorHora = leia.nextDouble();
                    h.setValorHora(valorHora);
                    h.hrsTrab();

                    
                   
                     
                    
                    
                }


                System.out.println("APLIQUE UM AUMENTO EM TODOS OS FUNCIONÁRIOS!");
                double allaumento = leia.nextDouble();
                

                for (Funcionarios f : funcionarios) {

                    f.aplicarAumento(allaumento);

                }
                System.out.println("SALÁRIOS COM AUMENTO!!");
                for (Funcionarios f : funcionarios){

                    if (f instanceof Assalariados) {
                        Assalariados A  = (Assalariados) f;
                        A.infsalario();

                        
                    }else if (f instanceof Horistas) {

                        Horistas H = (Horistas) f;
                        H.hrsTrab();
                    }
                }
                

                

                }


    }
    
}
