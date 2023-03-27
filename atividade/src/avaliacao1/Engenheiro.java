package avaliacao1;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crea = crea;
    }

     @Override
    public String toString() {
        return "\nNome: " + super.nome +
               "\nId: " + super.id +
               "\nTelefone: " + super.telefone +
               "\nEmail: " + super.email +
               "\nCidade: " + super.endereco.cidade +
               "\nCEP: " + super.endereco.cep +
               "\nLogadouro: " + super.endereco.logadouro +
               "\nComplemento: " + super.endereco.complemento +
               "\nNumero: " + super.endereco.numero +
               "\nUF: " + super.endereco.uf.getSigla() +
               "\nCREA: " + this.crea;
    }
    
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    
    
}
