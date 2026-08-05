// generic methods focused
// mantık, alacağı parametrenin type ını önceden veriyoz ki runtimede sıkıntı çıkmasın.

// ex: <T> type ı Class<T> type de de. generic olmasa (Class type) derdik. sadececc araya parametrenin type ını
// da sıkıştırdık olay bundan ibaret.
package Generics.Second;

public class PairImpl<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public PairImpl (K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public static <K, V> boolean compare(Pair <K, V> p1, Pair <K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
