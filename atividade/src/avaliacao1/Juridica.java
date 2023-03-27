package avaliacao1;

public class Juridica extends Pessoa{
     protected String cnpj;
     protected String inscricaoEstadual;

    public Juridica() {
    }

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
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
               "\nCNPJ: " + this.cnpj +
               "\nInscricao estadual: " + this.inscricaoEstadual;
    }

    
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
     
     
}
