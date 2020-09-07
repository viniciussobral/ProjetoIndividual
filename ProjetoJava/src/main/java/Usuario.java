public class Usuario {

    private String nomeUsuario;
    private Integer idade;
    private String CPF;
    private String RG;
    private String telefone;

    public Usuario(String nomeUsuario, Integer idade, String CPF, String RG, String telefone) {
        this.nomeUsuario = nomeUsuario;
        this.idade = idade;
        this.CPF = CPF;
        this.RG = RG;
        this.telefone = telefone;
    }


    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRG() {
        return RG;
    }

    public String getTelefone() {
        return telefone;
    }


    @Override
    public String toString() {
        return  "'" + nomeUsuario + '\'' +
                ", idade = " + idade +
                ", CPF = '" + CPF + '\'' +
                ", RG = '" + RG + '\'' +
                ", telefone = '" + telefone + '\'';

    }
}
