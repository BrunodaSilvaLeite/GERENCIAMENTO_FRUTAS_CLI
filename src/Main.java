//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto scanner para ler as entradas do usuario
        Scanner scanner = new Scanner(System.in);
        // Cria um array para armazenar as frutas
        ArrayList<String> frutas = new ArrayList<>();

        // Loop infinito para o menu principal, o programa vai rodar até o usuario escolher sair
        while(true) {
            try {
                // Exibe o menu com as opcoes para o usuario
                System.out.println("\nEscolha uma opcao");
                System.out.println("1. Adicionar uma fruta");
                System.out.println("2. Listar todas as frutas");
                System.out.println("3. Modificar uma fruta");
                System.out.println("4. Remover");
                System.out.println("5. Sair");
                System.out.print("Opcao: ");

                // pega a opção que o usuário escolheu
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa a opção para evitar problemas

                // Switch para executar a ação com base na opção escolhida
                switch (opcao) {
                    case 1:
                        // Adiciona uma nova fruta à lista
                        System.out.println("Digite uma fruta para adicionar:");
                        String novaFruta = scanner.nextLine();
                        frutas.add(novaFruta);
                        System.out.println(novaFruta + " foi adicionada.");
                        break;
                    case 2:
                        // Mostra a lista de frutas
                        System.out.println("Frutas: " + frutas);
                        break;
                    case 3:
                        // Modifica uma fruta
                        System.out.print("Digite o indice da fruta que deseja modificar: ");
                        int indiceModificar = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        if (indiceModificar >= 0 && indiceModificar < frutas.size()) {
                            System.out.print("Digite o novo nome da fruta: ");
                            String frutaModificada = scanner.nextLine();
                            frutas.set(indiceModificar, frutaModificada); // Substitui a fruta no índice escolhido
                            System.out.println("Fruta modificada: " + frutaModificada);
                        } else {
                            System.out.println("Indice invalido.");
                        }
                        break;
                    case 4:
                        // Remove uma fruta da lista
                        System.out.print("Digite o nome da fruta que deseja remover: ");
                        String frutaRemover = scanner.nextLine();
                        if (frutas.remove(frutaRemover)) {
                            System.out.println(frutaRemover + " foi removida.");
                        } else {
                            System.out.println(frutaRemover + " nao foi encontrada.");
                        }
                        break;
                    case 5:
                        // Sai do programa
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        // Caso o usuário digite uma opção inválida
                        System.out.println("Opcao invalida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                // Se o usuário digitar algo errado, como uma letra quando se espera um número
                System.out.println("Entrada invalida. Por favor, digite um numero.");
                scanner.nextLine();
            }
        }


        /* Cria o objeto HashTable para armazenar uma lista de frutas,
           onde cada item da lista tem uma chave do tipo Integer
           e um valor do tipo String.
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Usando o método put para adicionar elementos na lista do HashTable.
        hashtable.put(1, "Maçã");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Laranja");

        System.out.println("Hashtable:");

        /* Itera sobre cada par chave e valor da hashtable.
           Map.Entry<Integer, String> define o tipo de cada item, onde:
           - entry representa o par atual.
           - hashtable.entrySet() fornece o conjunto de pares da hashtable.
        for(Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        /* Cria um objeto HashMap para armazenar uma lista de frutas,
           similar ao Hashtable, com chave Integer e valor String.
           Diferente do Hashtable, o HashMap permite valores nulos e não é sincronizado.

        HashMap<Integer, String> hashmap = new HashMap<>();

        // Adiciona elementos no HashMap usando o método put.
        hashmap.put(1, "maçã");
        hashmap.put(2, "banana");
        hashmap.put(3, "laranja");
        hashmap.put(4, "uva");

        System.out.println("\nHashMap:");

        /* Faz a iteração sobre cada par chave e valor do hashmap.
           Map.Entry<Integer, String> define o tipo de cada item.
           - entry representa o par atual.
           - hashmap.entrySet() fornece todos os pares do HashMap.
        for(Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        /* Cria um objeto TreeMap, que armazena os itens de forma ordenada pela chave.
           - Chave Integer representa a posição.
           - Valor String representa o nome da fruta.
        TreeMap<Integer, String> treemap = new TreeMap<>();

        // Adiciona elementos no TreeMap usando o método put.
        treemap.put(1, "laranja");
        treemap.put(2, "maçã");
        treemap.put(3, "banana");
        treemap.put(4, "uva");

        System.out.println("\nTreeMap:");

        /* Itera sobre cada par chave e valor do treemap.
           Map.Entry<Integer, String> define o tipo de cada item.
           - entry é o par atual (chave e valor).
           - treemap.entrySet() fornece os pares do TreeMap, que estarão em ordem crescente das chaves.
        for(Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }
        */
    }
}