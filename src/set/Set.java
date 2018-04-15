package set;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Collections;
import java.util.HashSet;

public class Set {

    private HashSet<Element> set = new HashSet<>();

    public Set() {}

    public Set(Element[] elements) {
        Collections.addAll(set, elements);
    }

    public HashSet<Element> getSet() { return set; }

    public void add(Element element) {
        set.add(element);
    }

    public boolean contains(Element element) {
        return set.contains(element);
    }

    public int power() {
        return set.size();
    }

    public void remove(Element element) { set.remove(element); }

    public void setSet(HashSet<Element> set) {
        this.set = set;
    }

    public void add(Set s) {
        this.set.addAll(s.getSet());
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        set.forEach(element -> buffer.append(element.toString()).append(" "));
        return buffer.toString();
    }

    public class Operations {

        private Set plus(Set a, Set b) {
            b.getSet().forEach(a::add);
            return  a;
        }

        private Set plus(Set a, Element el) {
            a.add(el);
            return  a;
        }

        private Set plus(Element el, Set a) {
            a.add(el);
            return  a;
        }

        private Set minus(Set a, Set b) {
            Set c = new Set();
            b.getSet().forEach(a::remove);
            c.setSet(b.getSet());
            return  c;
        }

        private Set minus(Set a, Element el) {
            a.remove(el);
            return  a;
        }

        private Set multiply(Set a, Set b) {
            HashSet<Element> resultSet = new HashSet<>();
            a.getSet().forEach(elementA -> {
                AtomicBoolean elementsEqual = new AtomicBoolean(false);
                b.getSet().forEach(elementB -> {
                    if (elementA == elementB) {
                        elementsEqual.set(true);
                    }
                });
                if (elementsEqual.get()) {
                    resultSet.add(elementA);
                }
            });
            return new Set((Element[]) resultSet.toArray());
        }

        private Set multiply(Set a, Element el) {
            a.add(el);
            return  a;
        }

        private Set multiply(Element el, Set a) {
            a.add(el);
            return  a;
        }


        private Set divide(Set a, Set b) {
            Set res = new Set();
            res.add(minus(a, b));
            res.add(minus(b, a));
            return  res;
        }

        private boolean equal(Set a, Set b) {
            return  a.equals(b);
        }

        private boolean nonEqual(Set a, Set b) {
            return !equal(a, b);
        }

        private boolean equal(Element a, Element b) {
          return a.getElement().equals(b.getElement());
        }

        private boolean nonEaual(Element a, Element b) {
            return  !(equal(a, b));
        }
    }
}
