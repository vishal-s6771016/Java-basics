public class WhatsAppProfile {
    private String profileName;
    private String about;

    // Default Constructor (No arguments)
    public WhatsAppProfile() {
        profileName = "Unknown";
        about = "Hey There! I am using WhatsApp.";
    }

    // Constructor with Profile Name only
    public WhatsAppProfile(String profileName) {
        this.profileName = profileName;
        this.about = "Hey There! I am using WhatsApp.";
    }

    // Constructor with Profile Name and About
    public WhatsAppProfile(String profileName, String about) {
        this.profileName = profileName;
        this.about = about;
    }

    // Copy Constructor
    public WhatsAppProfile(WhatsAppProfile existingProfile) {
        this.profileName = existingProfile.profileName;
        this.about = existingProfile.about;
    }

    // Method to display profile details
    public void displayProfile() {
        System.out.println("Profile Name: " + profileName);
        System.out.println("About: " + about);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // Default Profile (No input given)
        WhatsAppProfile user1 = new WhatsAppProfile();
        user1.displayProfile();

        // Profile with only name
        WhatsAppProfile user2 = new WhatsAppProfile("John");
        user2.displayProfile();

        // Profile with name and custom about
        WhatsAppProfile user3 = new WhatsAppProfile("Emma", "Love traveling and coding!");
        user3.displayProfile();

        // Copying Emma's profile
        WhatsAppProfile user4 = new WhatsAppProfile(user3);
        user4.displayProfile();
    }
}
