import java.io.File;

public final class App {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("video.ogg", "mp4");
    }

}
