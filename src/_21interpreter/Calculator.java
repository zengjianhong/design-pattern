package _21interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author jehon
 */
public class Calculator {

    // 定义表达式
    private Expression expression;

    // 构造函数传参，并解析
    public Calculator(String expStr) {
        // 安排运算先后吮吸
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] charArray = expStr.toCharArray();

        Expression left;
        Expression right;
        // 遍历字符数组，即遍历[a, +, b]
        // 针对不同的情况做处理
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();// 从stack去除left => "a"
                    right = new VarExpression(String.valueOf(charArray[++i])); // 去除右表达式”b"
                    stack.push(new AddExpression(left, right)); // 然后根据得到left和right构建AddExpression加入stack
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 如果一个Var就创建要给VarExpression对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        // 当遍历完整个charArray数组后，stack就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        // 最后将表达式a+b和var = {a=10,b=20}
        // 然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}
