public class PlaylistTutorial extends Playlist {

    public String subject;

    PlaylistTutorial(String title, String subject){
        super(title);
        this.subject = subject;
    }
@Override
    public String recommendation(){
        if(nVideos == 0) {
            System.out.println("No recommendation not enough videos: ");
            return null;
        }else {
            return videos[0];
        }
    }
}
