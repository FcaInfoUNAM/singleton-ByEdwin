public class Main {
    public static void main(String[] args) {
        // Different parts of the code get the same instance using Singleton pattern
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setTheme("Dark"); // Change setting in one object...

        config1.printConfig();
        config2.printConfig(); // ...but the other object is unaware! This is bad.

        System.out.println("Are these the same instance? " + (config1 == config2));
    }
}