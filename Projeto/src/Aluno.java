public class Aluno extends Pessoa {
    public String matricula;

    public Aluno() { }


public static void main(String[] args) {
    Aluno fulano = new Aluno();
fulano.nome = "Fulano";
fulano.cpf = "000.000.000-00";
fulano.matricula = "123456";

System.out.println(fulano.nome);
}


}
