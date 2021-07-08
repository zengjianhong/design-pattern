package _17iterator;

import java.util.Iterator;

/**
 * @author jehon
 */
public class ComputerCollege implements College {

    // 因为你要便利你聚合拉ide类，所有你要为他写迭代器
    Department[] departments;

    // 保存当前数组的对象个数
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业", " Java专业 ");
        addDepartment("PHP专业", " PHP专业 ");
        addDepartment("大数据专业", " 大数据专业 ");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
