public class Funcionarios {

    public String nome;
    private int cpf;
    private String endereco;
    public long telefone ;
    public String setor;
    public String escolha;
    public double salario;
    public int horas;
    public double valor;
    public int porcentagem;
    public double aumentogeral ;






    public Funcionarios(String nome, int cpf, String endereco, long telefone, String setor, String escolha,
            double salario, int horas, double valor, int porcentagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
        this.escolha = escolha;
        this.salario = salario;
        this.horas = horas;
        this.valor = valor;
        this.porcentagem = porcentagem;
    }

    public void aumentoTds () {

        

        
    }






    public void aplicarAumento(double percentual) {
        // Método a ser implementado nas classes derivadas
    }


    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Setor: " + setor);
    }
    
    public Funcionarios(double salario) {
        this.salario = salario;
    }
    public Funcionarios() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getEscolha() {
        return escolha;
    }
    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    public int getPorcentagem() {
        return porcentagem;
    }

    
    
}
