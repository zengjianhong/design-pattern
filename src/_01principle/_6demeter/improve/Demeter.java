package _01principle._6demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jehon
 */
public class Demeter {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

/**
 * 学校总部员工类
 */
class Employee {

    private String id;

    public void setId(String id) { this.id = id; }

    public String getId() { return this.id; }
}

/**
 * 学院的员工类
 */
class CollegeEmployee {

    private String id;

    public void setId(String id) { this.id = id; }

    public String getId() { return this.id; }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManager {

    // 返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // 输出学院员工的信息
    public void printEmployee() {
        List<CollegeEmployee> list = getAllEmployee();
        System.out.println("----------------学院员工------------------");
        for (CollegeEmployee e : list) {
            System.out.println(e.getId());
        }
    }
}

/**
 * 学校管理类
 */
class SchoolManager {

    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee e =  new Employee();
            e.setId("学校总部员工id=" + i);
            list.add(e);
        }
        return list;
    }

    /**
     * 该方法完成输出学校总部和学院员工信息（id)
     *
     * 分析问题
     * - 1. 将输出学院的员工方法，封装到CollegeManager
     */
    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();

        List<Employee> list = this.getAllEmployee();
        System.out.println("---------------学校总部员工---------------------");
        for (Employee e : list) {
            System.out.println(e.getId());
        }
    }
}