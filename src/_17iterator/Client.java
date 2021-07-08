package _17iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jehon
 *
 * 迭代器模式
 */
public class Client {

    public static void main(String[] args) {
        // 创建学院
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }
}
