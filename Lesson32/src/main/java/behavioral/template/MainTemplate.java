package by.home.behavioral.template;

public class MainTemplate {

    public static void main(String[] args) {
        by.home.behavioral.template.WebsiteTemplate welcomePage = new by.home.behavioral.template.WelcomePage();
        by.home.behavioral.template.WebsiteTemplate newsPage = new by.home.behavioral.template.NewsPage();
        welcomePage.showPage();
        System.out.println("----------------------------------------");
        newsPage.showPage();
    }
}
