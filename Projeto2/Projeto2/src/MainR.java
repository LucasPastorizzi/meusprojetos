public class MainR {
    public static void main(String[] args) {
         

        Roupa r1 = new Roupa();
        

        r1.modelo = "Oversize";
        r1.tamanho = "M";
        r1.cor = "Preto";


        Camiseta c1 = new Camiseta();
        c1.modelo = "Normal";
        c1.tamanho = "GG";
        c1.cor = "Azul Royal";
        c1.desbotada = "Não";


        Moletom m1 = new Moletom();
        

        m1.cor = "Preto";
        m1.tipo = "Careca";
        m1.tamanho = "EXG";

        System.out.println("Roupa; \n" + r1.modelo + "\n" + r1.tamanho + "\n" + r1.cor);
        System.out.println("Camiseta ; \n" + c1.modelo + "\n" + c1.tamanho + "\n" + c1.cor + "\n" + c1.desbotada);
        System.out.println("Modelo ; \n" + m1.cor + "\n" + m1.tipo + "\n" + m1.tamanho); 


        

        





        


    }
    
}
