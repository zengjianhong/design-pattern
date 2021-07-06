package _02uml._3implementation;

/**
 * @author jehon
 */
public class PersonServiceBean implements PersonService {

    @Override
    public void delete(Integer id) {
        System.out.println("delete...");
    }
}
