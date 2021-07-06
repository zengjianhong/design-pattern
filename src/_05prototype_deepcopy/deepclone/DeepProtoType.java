package _05prototype_deepcopy.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 * @author jehon
 */
public class DeepProtoType implements Serializable, Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    DeepProtoType() { super(); }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 这里完成对基本数据类型（属性）和String的克隆
        Object deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            // 序列化（输出去）
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出
            // 反序列化（读进去）
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println(e2.getMessage());
            }
        }
    }
}
