package com.example.ProjetoInvestimento;

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


    public abstract String mostrarRendimento();

    public String getmostrarRendimento(){

        return String.format(" Você investindo %.2f em %s, no final do ano você terá = R$ %.2f ", getValorInvestimento(), getTipoInvestimento(), calculaRendimento()) + " Rendeu 5% ao ano ";
    }

    public Double getcalculaRendimento() {
        return calculaRendimento();
    }

    @Override
    public String toString() {
        return "Investimento{" +
                "tipoInvestimento='" + tipoInvestimento + '\'' +
                ", valorInvestimento=" + valorInvestimento +
                "} " + super.toString();
    }



}
