public abstract class Investimento extends Empresa{

    private String tipoInvestimento;
    private Double valorInvestimento;


    public Investimento(String nomeEmpresa, String tipoInvestimento, Double valorInvestimento) {
        super(nomeEmpresa);
        this.tipoInvestimento = tipoInvestimento;
        this.valorInvestimento = valorInvestimento;
    }

    public abstract Double calculaRendimento();

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public Double getValorInvestimento() {
        return valorInvestimento;
    }


    @Override
    public String toString() {
        return  " Tipo Investimento = '" + tipoInvestimento + '\'' +
                " Valor Investimento = " + valorInvestimento + super.toString();
    }
}
