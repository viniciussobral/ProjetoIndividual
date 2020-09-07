public class FundoImobiliario extends Investimento{


    public FundoImobiliario(String nomeEmpresa, String tipoInvestimento, Double valorInvestimento) {
        super(nomeEmpresa, tipoInvestimento, valorInvestimento);
    }

    public Double calculaRendimento() {
        return getValorInvestimento() * 1.05;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(" Você investindo %.2f em Fundo Imobiliario no final do ano você terá = R$ %.2f ", getValorInvestimento(), calculaRendimento()) + " Rendeu 5% ao ano ";
    }
}
