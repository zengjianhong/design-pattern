package _15command;

/**
 * @author jehon
 *
 * 创建命令接口
 */
public interface Command {

    // 执行动作（操作）
    void execute();

    // 撤销动作（操作）
    void undo();
}
