import java.util.Random;
class Playlist{
    public String title;
    public String[] videos;
    public int nVideos;

    Playlist(String title){
        this.title = title;
        videos = new String[10];
        nVideos=0;
    }
    public void addVideo(String video){
       if(nVideos == 10)
           System.out.println("Full of videos");
       else {
           videos[nVideos] = video;
           nVideos++;
       }
    }
    public String recommendation(){
        Random r = new Random();
        if(nVideos==0) {
            System.out.println("No recommendation not enough videos: ");
            return null;
        }else {
            return videos[r.nextInt(nVideos)];
        }
    }
    public void print(){
        System.out.println("title: "+title);
        for(int i=0; i<nVideos; i++){
            System.out.println("Videos: " + videos[i]);
        }
    }
}