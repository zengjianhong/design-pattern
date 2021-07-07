package _13proxy.staticproxy;

/**
 * @author jehon
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课中……");
    }
}
