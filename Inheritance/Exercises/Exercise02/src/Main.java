class Main {

    public static void main(String[] args) {
        Playlist pl1 = new Playlist("Philosophy Lessons");
        PlaylistTutorial pl2 = new PlaylistTutorial("Java","programming");
    
        pl1.addVideo("Socrates' Philosophy");
        pl1.addVideo("Photo's Philosophy");
        pl1.addVideo("Socrates' Philosophy");
        pl1.addVideo("Photo's Philosophy");
        pl1.addVideo("Socrates' Philosophy");
        pl1.print();
        System.out.println("");
        System.out.println(pl1.recommendation());
        System.out.println("");

        pl2.addVideo("Episode Java1");
        pl2.addVideo("Episode Java2");
        pl2.addVideo("Episode Java3");
        pl2.print();
        System.out.println("");
        System.out.println(pl2.recommendation());

    }
}