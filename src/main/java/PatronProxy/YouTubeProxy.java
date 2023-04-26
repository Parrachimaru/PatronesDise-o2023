package PatronProxy;

import java.util.HashMap;
import java.util.Map;

public class YouTubeProxy implements YouTubeManager {

    private String apiKey;
    private YouTubeManager youTubeAPI;
    private Map<String, String> videoCache = new HashMap<String, String>();

    public YouTubeProxy(String apiKey) {
        this.apiKey = apiKey;
    }

    public String buscarVideo(String query) {
        if (videoCache.containsKey(query)) {
            System.out.println("Recuperando video de la caché...");
            return videoCache.get(query);
        } else {
            if (youTubeAPI == null) {
                System.out.println("Inicializando YouTubeLib...");
                youTubeAPI = new YouTubeLib(apiKey);
            }
            System.out.println("Realizando búsqueda de video en YouTubeLib...");
            String videoData = youTubeAPI.buscarVideo(query);
            videoCache.put(query, videoData);
            return videoData;
        }
    }
}
