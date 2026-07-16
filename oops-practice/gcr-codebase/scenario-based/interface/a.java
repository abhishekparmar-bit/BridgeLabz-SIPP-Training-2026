// Interfaces
interface TextModeration {
    boolean checkOffensive(String post);
    default void displayModerationPolicy() {
        System.out.println("Policy: No offensive words allowed.");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);
    default void displayModerationPolicy() {
        System.out.println("Policy: No spam or repeated content.");
    }
}

// Implementation
class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean checkOffensive(String post) {
        return post.contains("badword");
    }

    @Override
    public boolean checkSpam(String post) {
        return post.contains("Buy now") || post.contains("Click here");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    // Static helper
    public static boolean containsRestrictedWords(String post) {
        return post.contains("restricted");
    }
}

// Demo
public class a {
    public static void main(String[] args) {
        String[] posts = {
            "This is a normal post",
            "Buy now and get discount",
            "This post contains badword",
            "Safe content but restricted"
        };

        ContentModerator cm = new ContentModerator();
        cm.displayModerationPolicy();

        for (String post : posts) {
            if (cm.checkSpam(post)) {
                System.out.println("SPAM: " + post);
            } else if (cm.checkOffensive(post)) {
                System.out.println("OFFENSIVE: " + post);
            } else if (ContentModerator.containsRestrictedWords(post)) {
                System.out.println("RESTRICTED: " + post);
            } else {
                System.out.println("VALID: " + post);
            }
        }
    }
}
