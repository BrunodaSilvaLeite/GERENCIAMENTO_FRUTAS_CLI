//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Hashtable;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /* Cria o objeto HashTable para armazenar uma lista de frutas,
           onde cada item da lista tem uma chave do tipo Integer
           e um valor do tipo String. */
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Usando o método put para adicionar elementos na lista do HashTable.
        hashtable.put(1, "Maçã");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Laranja");

        System.out.println("Hashtable:");

        /* Itera sobre cada par chave e valor da hashtable.
           Map.Entry<Integer, String> define o tipo de cada item, onde:
           - entry representa o par atual.
           - hashtable.entrySet() fornece o conjunto de pares da hashtable. */
        for(Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        /* Cria um objeto HashMap para armazenar uma lista de frutas,
           similar ao Hashtable, com chave Integer e valor String.
           Diferente do Hashtable, o HashMap permite valores nulos e não é sincronizado. */

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
           - hashmap.entrySet() fornece todos os pares do HashMap. */
        for(Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        /* Cria um objeto TreeMap, que armazena os itens de forma ordenada pela chave.
           - Chave Integer representa a posição.
           - Valor String representa o nome da fruta. */
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
           - treemap.entrySet() fornece os pares do TreeMap, que estarão em ordem crescente das chaves. */
        for(Map.Entry<Integer, String> entry : treemap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

    }
}