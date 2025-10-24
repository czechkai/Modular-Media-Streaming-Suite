import java.util.HashMap;
import java.util.Map;

/*
  MediaSource defines a way to load media by id. This abstracts where the
  media comes from (local disk, network HLS, playlists, etc.).
 */
interface MediaSource {
    Media load(String id);
}

class LocalSource implements MediaSource {
    @Override
    public Media load(String id) {
        // In a real app we'd check the filesystem. Here we simulate.
        System.out.println("Loading local media: " + id);
        return new MediaFile(id);
    }
}

class HlsSource implements MediaSource {
    @Override
    public Media load(String id) {
        System.out.println("Loading HLS stream: " + id);
        return new MediaFile("HLS:" + id);
    }
}

/**
 * RemoteProxySource demonstrates the Proxy pattern: it wraps a real remote
 * source and caches results to avoid reloading the same remote media repeatedly.
 */
class RemoteProxySource implements MediaSource {
    private MediaSource remote;
    private Map<String, Media> cache = new HashMap<>();

    public RemoteProxySource(MediaSource remote) {
        this.remote = remote;
    }

    @Override
    public Media load(String id) {
        if (cache.containsKey(id)) {
            System.out.println("Cache hit for: " + id);
            return cache.get(id);
        }
        System.out.println("sCache miss for: " + id + " - fetching from remote");
        Media m = remote.load(id);
        cache.put(id, m);
        return m;
    }
}
