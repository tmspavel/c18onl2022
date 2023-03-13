package by.teachmeskills.javaEEPatterns.model;

public enum PagesPath {
    HOME_PAGE("home.jsp"),
    SIGN_IN_PAGE("signin.jsp");

    private final String path;

    PagesPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

