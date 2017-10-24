package chapter3;


public class PairClass<K , V> implements Pair<K, V> {
    private K key;
    private V value;
    public PairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;

    }


}

class TestPair{
    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new PairClass<>(2,22);
        Pair<String, Integer> pair2 = new PairClass<>("3",33);

        System.out.println(pair1.getKey().getClass().getName() + " " + pair1.getKey());
        System.out.println(pair2.getKey().getClass().getName() + " " + pair2.getKey());
    }
}

interface Pair<K, V> {
    public K getKey();
    public V getValue();
}