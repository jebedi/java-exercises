package designpattern.behavioral.memento;

import java.util.List;
import java.util.Map;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComplexObject {
    private String stateDescription;
    private List<Object> components;
    private Map<Integer, Object> cache;
    private PrimitiveIterator.OfInt ints;

    public ComplexObject(String stateDescription, List<Object> components, Map<Integer, Object> cache) {
        this.stateDescription = stateDescription;
        this.components = components;
        this.cache = cache;
        ints = IntStream.iterate(1, i -> i + 1).iterator();
    }

    public void addComponent(Object element) {
        components.add(element);
    }

    public void calculateSomething(Object element) {
        cache.put(ints.nextInt(), element);
    }

    private void updateStateDescription() {
        String componentString = components.stream()
                .map(c -> "C")
                .collect(Collectors.joining());

        String cacheString = cache.keySet().stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        stateDescription = componentString + cacheString;
    }

    public Memento save() {
        return new Memento(stateDescription, components, cache);
    }

    public void load(Memento mem) {
        stateDescription = mem.getStateDescription();
        components = mem.getComponents();
        cache = mem.getCache();
    }

    public void print() {
        System.out.println("STATE: " + stateDescription);
        System.out.println("Components size: " + components.size());
        System.out.println("Cache size: " + cache.size());
    }

    public static class Memento {
        private final String stateDescription;
        private final List<Object> components;
        private final Map<Integer, Object> cache;

        public Memento(String stateDescription, List<Object> components, Map<Integer, Object> cache) {
            this.stateDescription = stateDescription;
            this.components = List.copyOf(components);
            this.cache = Map.copyOf(cache);
        }

        public String getStateDescription() {
            return stateDescription;
        }

        public List<Object> getComponents() {
            return components;
        }

        public Map<Integer, Object> getCache() {
            return cache;
        }
    }

}
