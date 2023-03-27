package avaliacao1;

public class Medico extends Funcionario{
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
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
               "\nCRM: " + this.crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    
    
}
