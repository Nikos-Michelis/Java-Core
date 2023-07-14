class B extends A {
    int b;

    B(int a, int b) {
        super(a);
        
        //super(automated); automatic definition of terms
        this.b = b;
        System.out.println("Constructing B..");
    }
}