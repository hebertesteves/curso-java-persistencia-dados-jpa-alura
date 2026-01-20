package hebertesteves.desafio01;

public enum Moeda {
    DOLAR(0.18),
    EURO(0.15);

    private final double taxaDeConversao;

    Moeda(double taxaDeConversao) {
        this.taxaDeConversao = taxaDeConversao;
    }

    public double converterPara(double valorEmReais) {
        return valorEmReais * taxaDeConversao;
    }
}
