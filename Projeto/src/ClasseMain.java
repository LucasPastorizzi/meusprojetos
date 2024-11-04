public class ClasseMain {
    public static void main(String[] args) {
        
        Vendedor joao = new Vendedor();

        joao.nome = "João Siqueira";
        joao.salario = 1000;

        System.out.println("Nome;" + joao.nome +"Salario; " + joao.salario);

        joao.aplicaAumento(500);

        System.out.println("Joao seu salario aumentou no valor total de " + joao.salario);

        Administrativo lucas = new Administrativo();

        lucas.nome = "Lucas";
        lucas.salario = 6000;
        lucas.cargo = "CLT";

        System.out.println("Lucas sua ficha; " +  "\n" + lucas.nome + "\n" + lucas.salario + "\n" + lucas.cargo+ "\n" );

        lucas.aplicaAumento(5000);

        System.out.println("ATULIZO DE SALÁRIO; \n" + lucas.salario);



    }
    
}
