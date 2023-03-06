package behavioral.template;

public class MainTemplate {

    public static void main(String[] args) {
        behavioral.template.WebsiteTemplate welcomePage = new behavioral.template.WelcomePage();
        behavioral.template.WebsiteTemplate newsPage = new behavioral.template.NewsPage();
        welcomePage.showPage();
        System.out.println("----------------------------------------");
        newsPage.showPage();
    }
}
