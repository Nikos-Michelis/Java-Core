class Main {

    public static void main(String[] args) {
        try {
            String s = null;
            s.equals("oops");
        } catch (NullPointerException ob) {
            System.out.println(ob);
        }
    }
}