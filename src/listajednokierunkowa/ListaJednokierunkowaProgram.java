package listajednokierunkowa;

public class ListaJednokierunkowaProgram {

    public static void main(String[] args) {

        ListaJednokierunkowa lista = new ListaJednokierunkowa();

        for (int i = 1; i <= 10; i++) {
            lista.add(new Element(i));
        }

        Element element = lista.getHead();

        do {

            System.out.println(element);
            element = element.getNext();

        } while (element.getNext() != null);



    }
}
