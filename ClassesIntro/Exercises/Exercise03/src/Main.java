public class Main {
    public static void main(String[] args) {

        Philosopher plato = new Philosopher();
        plato.name = "Plato";
        plato.era = "Ancient Greek";
        plato.books[0] = "The Republic";
        plato.books[1] = "Phaedon";
        plato.nBooks = 2;
        plato.school = "Platonism";

        Philosopher s = new Philosopher();
        s.name = "Baruch Spinoza";
        s.era = "Modern Netherlands";
        s.books[0] = "Ethics";
        s.books[1] = "Political Treatise";
        s.nBooks = 2;
        s.school = "Rationalism";

        plato.print();
        s.print();
    }
}
