public class TesteInvestimento {

    public static void main(String[] args) {

        Usuario user = new Usuario("Vinicius", 18, "35676021455", "674336543", "01130483922");

        Usuario user2 = new Usuario("Bruno", 30, "35676021728", "674336987", "011304834321");

        Investimento investBolsa = new Bolsa("CVC", "Ações", 800.0);
        Investimento investFundos = new FundoImobiliario("RBR Investimentos", "FII",400.0);
        Investimento investTesouro = new TesouroDireto("Banco BTG Pactual", "Tesouro Direto", 600.0);

        Investimento investBolsa2 = new Bolsa("CVC", "Ações", 800.0);
        Investimento investFundos2 = new FundoImobiliario("RBR Investimentos", "FII",400.0);
        Investimento investTesouro2 = new TesouroDireto("Banco BTG Pactual", "Tesouro Direto", 600.0);


        Corretora clear = new Corretora();
        Corretora clear2 = new Corretora();


        clear.adicionaInvestimento(investFundos, user);
        clear.adicionaInvestimento(investTesouro,user);

        clear2.adicionaInvestimento(investTesouro2, user2);
        clear2.adicionaInvestimento(investBolsa2,user2);



        System.out.println("User 1");
        clear.exibeInvestimentos(user);

        System.out.println();

        System.out.println("User 2");
        clear2.exibeInvestimentos(user2);

    }
}
