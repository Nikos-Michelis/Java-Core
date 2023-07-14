class Philosopher {

    String name;
    String era;
    String[] books;
    int nBooks;
    String school;

    Philosopher() {
        books = new String[5];
        nBooks = 0;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Era: " + era);
        System.out.print("Books: ");
        for (var item: books)
            System.out.print(item + " ");
        System.out.println("");
        System.out.println("School: " + school);
    }
}
