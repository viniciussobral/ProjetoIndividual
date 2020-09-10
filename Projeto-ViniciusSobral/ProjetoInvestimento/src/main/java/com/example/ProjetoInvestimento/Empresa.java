package com.example.ProjetoInvestimento;

public class Empresa {

    private String nomeEmpresa;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeEmpresa() {

        return nomeEmpresa;
    }

    @Override
    public String toString() {
        return " Nome Empresa = ,'" + nomeEmpresa + '\'';
    }

}
