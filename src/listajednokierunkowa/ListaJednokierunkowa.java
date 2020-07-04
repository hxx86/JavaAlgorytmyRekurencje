package listajednokierunkowa;

public class ListaJednokierunkowa {

    private Element head;
    private Element tail;

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public void add(Element element) {

        if (head == null) {
            head = element;
            tail = element;
        } else {
            tail.setNext(element);
            tail = element;
        }

    }

}
