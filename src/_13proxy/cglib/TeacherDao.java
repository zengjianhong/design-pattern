package _13proxy.cglib;

/**
 * @author jehon
 */
public class TeacherDao {

    public String teach() {
        System.out.println(" 老师授课中，我时cglib代理，不需要实现接口");
        return "hello";
    }
}
