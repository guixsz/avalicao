package avaliacao1;

public enum Genero {
    MASCULINO('M'),
    FEMININO('F');
    
    private char texto;

    private Genero(char texto) {
        this.texto = texto;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public char getTexto() {
        return texto;
    }
    
    
}
