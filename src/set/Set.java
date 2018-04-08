package set;

import java.util.Collections;
import java.util.HashSet;

public class Set {

    private HashSet<Element> set = new HashSet<>();

    public Set(Element[] elements) {
        Collections.addAll(set, elements);
    }

    public HashSet<Element> getSet() {
        return set;
    }

    public void add(Element element) {
        set.add(element);
    }

    public boolean contains(Element element) {
        return set.contains(element);
    }

    public int power() {
        return set.size();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        set.forEach(element -> buffer.append(element.toString()).append(" "));
        return buffer.toString();
    }
}
