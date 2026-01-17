public class AppConfig {
    private String theme;
    private String language;
    
    // Instancia estática privada (Eager Initialization)
    private static final AppConfig instance = new AppConfig();

    // Constructor privado para evitar instanciación desde fuera
    private AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }
    
    // Método getter público y estático para obtener la única instancia
    public static AppConfig getInstance() {
        return instance;
    }

    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}