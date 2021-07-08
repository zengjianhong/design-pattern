package _21interpreter;

import java.util.HashMap;

/**
 * @author jehon
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10,b=20}
    // interpreter根据变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
