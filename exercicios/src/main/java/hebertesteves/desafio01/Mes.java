package hebertesteves.desafio01;

public enum Mes {
    JANEIRO(31),
    FEVEREIRO(28),
    MARÇO(31),
    ABRIL(30),
    MAIO(31),
    JUNHO(30),
    JULHO(31),
    AGOSTO(31),
    SETEMBRO(30),
    OUTUBRO(31),
    NOVEMBRO(30),
    DEZEMBRO(31);

    private final int numeroDeDias;

    Mes (int dias) {
        numeroDeDias = dias;
    }
    public int getNumeroDeDias() {
        return numeroDeDias;
    }
}
