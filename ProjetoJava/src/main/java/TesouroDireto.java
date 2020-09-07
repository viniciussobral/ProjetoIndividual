public class TesouroDireto extends Investimento{

    public TesouroDireto(String nomeEmpresa, String tipoInvestimento, Double valorInvestimento) {
        super(nomeEmpresa, tipoInvestimento, valorInvestimento);
    }

    public Double calculaRendimento() {
        return getValorInvestimento() * 1.03;
    }


    @Override
    public String toString() {
        return super.toString() + String.format(" Você investindo %.2f em Tesouro Direto no final do ano você terá = R$ %.2f ", getValorInvestimento(), calculaRendimento()) + " Rendeu 3% ao ano ";
    }
}
