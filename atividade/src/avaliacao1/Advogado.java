package avaliacao1;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado() {
    }

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.oab = oab;
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
               "\nOAB: " + this.oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    
}
