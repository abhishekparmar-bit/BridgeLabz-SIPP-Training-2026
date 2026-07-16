// Interfaces
interface StreamingService {
    void streamMovie(String movie);
    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription: Premium Plan");
    }
}

interface GamingService {
    void playGame(String game);
    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription: Gold Plan");
    }
}

// Implementation
class SmartTV implements StreamingService, GamingService {
    String[] movies = {"Inception", "Interstellar"};
    String[] games = {"FIFA", "Minecraft"};

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }

    // Resolve default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

// Demo
public class SmartTVDemo {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        tv.streamMovie("Inception");
        tv.playGame("FIFA");
    }
}
