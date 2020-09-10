package com.example.ProjetoInvestimento;

public class FundoImobiliario extends Investimento{


    public FundoImobiliario(String nomeEmpresa, String tipoInvestimento, Double valorInvestimento) {
        super(nomeEmpresa, tipoInvestimento, valorInvestimento);
    }

    @Override
    public Double calculaRendimento() {
        return getValorInvestimento() * 1.05;
    }


    public String mostrarRendimento() {

        String mostrar = "";

        return mostrar;
    }


    public String getmostrarRendimento(){

        String mostrar = String.format(" Você investindo %.2f em %s no final do ano você terá = R$ %.2f ", getValorInvestimento(),
                getTipoInvestimento(), calculaRendimento()) + " Rendeu 5% ao ano ";

        return mostrar;
    }


    public Double getcalculaRendimento() {
        return calculaRendimento();
    }



    @Override
    public String toString() {
        return super.toString() + String.format(" Você investindo %.2f em Fundo Imobiliario no final do ano você terá = R$ %.2f ", getValorInvestimento(), calculaRendimento()) + " Rendeu 5% ao ano ";
    }

}
