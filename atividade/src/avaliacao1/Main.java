package avaliacao1;

public class Main {
    public static void main(String[] args) {
        Juridica jud1 = new Juridica("929838674728", "82732", 012345, "Claudio", "3325-7823", "@ba.senai.estudante.br",
                            new Endereco("Rua das alamedas", "323", "Perto do Brasilgás", "12908-230", "Salvador", UnidadeFederativa.BAHIA));
    
        System.out.println(jud1.toString());
        
        Advogado adv1 = new Advogado("987654321", "12345", "9812816", "782138726", Setor.JURIDICO, 1200, 27, Genero.MASCULINO, 012345, "Henrique", "3325-7823", "@ba.senai.estudante.br",
                            new Endereco("Rua das alamedas", "323", "Perto do Brasilgás", "12908-230", "Salvador", UnidadeFederativa.BAHIA));
    
        System.out.println(adv1.toString());  
        
        Engenheiro eng1 = new Engenheiro("987654321", "12345", "9812816", "782138726", Setor.ENGENHARIA, 1200, 27, Genero.FEMININO, 012345, "Bruna", "3325-7823", "@ba.senai.estudante.br",
                              new Endereco("ponte", "323", "Perto do Brasilgás", "12908-230", "Fortaleza", UnidadeFederativa.BAHIA));
        
        System.out.println(eng1.toString());
    
        Medico med1 = new Medico("987654321", "12345", "9812816", "782138726", Setor.SAUDE, 1200, 27, Genero.FEMININO, 012345, "Manuele", "3325-7823", "@ba.senai.estudante.br",
                            new Endereco("Rua das alamedas", "323", "Perto do Brasilgás", "12908-230", "Bragança Paulista", UnidadeFederativa.SAO_PAULO));
        
        System.out.println(med1.toString());
    
        Cliente cli1 = new Cliente(2163321, 54, Genero.MASCULINO, 012345, "Marcio", "3325-7823", "@ba.senai.estudante.br",
                            new Endereco("Rua das alamedas", "933", "Do lado da smartfit", "12908-230", "Macapa", UnidadeFederativa.AMAPA));
        
        System.out.println(cli1.toString());
    }
}
