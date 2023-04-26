package PatronProxy;

public class YouTubeLib implements YouTubeManager {

    private String apiKey;

    public YouTubeLib(String apiKey) {
        this.apiKey = apiKey;
    }

    public String buscarVideo(String buscar) {
        // Realiza una solicitud a la Libreria de YouTube para buscar el video
        String videoData = "Resultados de la búsqueda del video '" + buscar + "'";

        return videoData;
    }
}
