package _12flyweight;

/**
 * @author jehon
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteCategory("新闻");

        webSite.use(new User("tom"));

        WebSite webSite1 = factory.getWebSiteCategory("博客");
        webSite.use(new User("jack"));

        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite.use(new User("smith"));

        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite.use(new User("king"));

        System.out.println("网站的分类共=" + factory.getWebSiteCount());
    }
}
