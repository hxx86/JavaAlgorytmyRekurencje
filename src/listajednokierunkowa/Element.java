package listajednokierunkowa;

public class Element {

    private Element next;
    private Element prev;
    private int value;

    public Element(int value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" +
                "value=" + value +
                '}';
    }
}
