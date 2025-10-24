/**
  Interface representing any playable media in the streaming suite.
  This is the base component that can be extended by concrete implementations,
  decorated with additional features, or composed into playlists.
 */

interface Media {
    String getName();
    void play();
}
class MediaFile implements Media {
    private String name;
    public MediaFile(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void play() {
        System.out.println("Playing file: " + name);
    }
}
public class MediaApp {
    public static void main(String[] args) {
        Media media = new MediaFile("Example Song");
        System.out.println("Now playing: " + media.getName());
        media.play();
    }
}