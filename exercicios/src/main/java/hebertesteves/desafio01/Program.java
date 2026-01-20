package hebertesteves.desafio01;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        // Ex1
        List<String> input = Arrays.asList("10", "abc", "20", "30x");

        List<Integer> numeros = input.stream()
                .map(n -> {
                   try {
                      return Optional.of(Integer.parseInt(n));
                   } catch (NumberFormatException e) {
                       return Optional.<Integer>empty();
                   }
                })
                .flatMap(Optional::stream)
                .toList();

        System.out.println(numeros);

        System.out.println();

        // Ex2
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty

        System.out.println();

        // Ex3
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

        System.out.println();

        // Ex4
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false

        System.out.println();

        // Ex5
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));

        System.out.println();

        // Ex6
        System.out.println(Mes.FEVEREIRO.getNumeroDeDias()); // 28
        System.out.println(Mes.JULHO.getNumeroDeDias()); // 31

        System.out.println();

        // Ex7
        System.out.println(Moeda.DOLAR.converterPara(100)); // 19.60 (aproximado)
        System.out.println(Moeda.EURO.converterPara(100)); // 18.18 (aproximado)

        System.out.println();

        // Ex8
        System.out.println(CodigoErro.NOT_FOUND.getCodigo()); // 404
        System.out.println(CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida

    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        if (numero.isPresent() && numero.get() > 0) {
            return Optional.of(numero.get() * numero.get());
        } else {
            return Optional.empty();
        }
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split(" ");
        StringBuilder sb = new StringBuilder(nomes[0]);

        if (nomes.length > 1) {
            sb.append(" ");
            sb.append(nomes[nomes.length - 1]);
        }

        return sb.toString();
    }

    public static boolean ehPalindromo(String palavra) {
        String normalizada = palavra.replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(normalizada).reverse().toString();
        return normalizada.equals(reverso);
    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(String::toLowerCase).toList();
    }
}
