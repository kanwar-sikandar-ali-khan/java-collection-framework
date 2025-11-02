package com.collectionFramework.mapInterface;

public class mapInterface {
}


//Methods:
//int size(); → Returns number of mappings.
//boolean isEmpty(); → Checks if empty.
//boolean containsKey(Object key); → Checks if key exists.
//boolean containsValue(Object value); → Checks if value exists.
//V get(Object key); → Returns value for key.
//        V put(K key, V value); → Adds or updates entry.
//V remove(Object key); → Removes entry by key.
//void putAll(Map<? extends K, ? extends V> m); → Copies all entries.
//void clear(); → Removes all entries.
//        Set<K> keySet(); → Returns all keys.
//        Collection<V> values(); → Returns all values.
//        Set<Map.Entry<K,V>> entrySet(); → Returns key-value pairs.
//
//default V getOrDefault(Object key, V defaultValue); → Returns value or default.
//default void forEach(BiConsumer<? super K, ? super V> action); → Performs action for each pair.
//default void replaceAll(BiFunction<? super K, ? super V, ? extends V> f); → Replaces all values.
//default V putIfAbsent(K key, V value); → Adds only if key missing.
//default boolean remove(Object key, Object value); → Removes if both match.
//default boolean replace(K key, V oldValue, V newValue); → Replaces if old value matches.
//default V replace(K key, V value); → Replaces value for key.
//default V computeIfAbsent(K key, Function<? super K, ? extends V> f); → Computes if missing.
//default V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> f); → Recomputes if present.
//default V compute(K key, BiFunction<? super K, ? super V, ? extends V> f); → Computes mapping.
//default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> f); → Merges values.