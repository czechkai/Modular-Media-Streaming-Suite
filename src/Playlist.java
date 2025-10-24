import java.util.ArrayList;
import java.util.List;

/**
  Playlist is a composite that can contain Media items (MediaFile or other Playlists).
  Demonstrates the Composite design pattern: clients treat single media files and
  playlists uniformly via the Media interface.
 */
public class Playlist implements Media {
    private String name;
    private List<Media> items;

    public Playlist(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Media m : items) {
            m.play();
        }
    }

    // Convenience methods to manage playlist contents
    public void add(Media m) {
        items.add(m);
    }

    public void remove(Media m) {
        items.remove(m);
    }

    public List<Media> getItems() {
        return new ArrayList<>(items);
    }
}
