package _21interpreter;

import java.util.HashMap;

/**
 * @author jehon
 */
public class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    // 因为SymbolExpression是让其子类来实现，因此interpreter是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
