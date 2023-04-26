package PatronProxy;

public class MainProxy {

    private static String apiKey;

    public static void main(String[] args) {

        YouTubeManager youTubeAPI = new YouTubeProxy(apiKey);

        System.out.println("Buscando video por primera vez...");
        String videoData1 = youTubeAPI.buscarVideo("gatitos");
        System.out.println(videoData1);

        System.out.println("Buscando el mismo video por segunda vez...");
        String videoData2 = youTubeAPI.buscarVideo("gatitos");
        System.out.println(videoData2);

    }

}
