# API Stream em Java

A API Stream em Java é uma ferramenta poderosa para trabalhar com coleções de dados de forma eficiente e expressiva. Ela permite realizar operações em coleções de dados de maneira declarativa e funcional, facilitando a manipulação e transformação dos elementos. Um dos principais pontos fortes da API Stream é a capacidade de usar os métodos `Consumer`, `Supplier`, `Function`, `Predicate` e `BinaryOperator` para realizar diversas operações em coleções de dados.

## Métodos da API Stream

Aqui está uma explicação detalhada de cada um desses métodos:

1. **Consumer**: O `Consumer` é uma interface funcional que representa uma operação que aceita um único argumento e não retorna nenhum resultado. Na API Stream, ele é frequentemente usado em métodos como `forEach`, que permite aplicar uma ação a cada elemento da coleção sem a necessidade de um loop explícito.

2. **Supplier**: O `Supplier` é outra interface funcional que não recebe argumentos, mas retorna um resultado. Ele é comumente usado em operações que precisam gerar ou fornecer elementos, como `generate` ou `ofSupplier`.

3. **Function**: A interface `Function` representa uma função que aceita um argumento e retorna um resultado. Na API Stream, é frequentemente usado para mapear ou transformar elementos de uma coleção. Por exemplo, o método `map` permite aplicar uma função a cada elemento da coleção e obter uma nova coleção com os resultados.

4. **Predicate**: O `Predicate` é uma interface funcional que aceita um argumento e retorna um valor booleano. É amplamente utilizado em operações que envolvem filtragem de elementos. Por exemplo, o método `filter` usa um `Predicate` para selecionar elementos com base em uma condição específica.

5. **BinaryOperator**: A interface `BinaryOperator` representa uma operação que aceita dois argumentos do mesmo tipo e retorna um resultado do mesmo tipo. Embora seja menos comum na API Stream, você pode encontrar sua utilidade em operações de redução, como `reduce`, onde é usado para combinar elementos em um único resultado.

## Exemplos de Uso

Aqui estão alguns exemplos simples de código usando os métodos da API Stream em Java:

```java
// Consumer
List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
nomes.stream().forEach(nome -> System.out.println("Olá, " + nome));

// Supplier
Stream<Integer> numerosAleatorios = Stream.generate(() -> (int) (Math.random() * 100));
numerosAleatorios.limit(5).forEach(System.out::println);

// Function
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> aoQuadrado = numeros.stream().map(numero -> numero * numero).collect(Collectors.toList());

// Predicate
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> pares = numeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());

// BinaryOperator
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> soma = numeros.stream().reduce((a, b) -> a + b);
