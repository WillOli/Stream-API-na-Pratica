import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    /*
     *Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso)
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.*/
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "kotlin", "python", "SQL", "PostMan", "SpringBoot");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar oas palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que pssou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

    }
}
