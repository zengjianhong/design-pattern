package _05prototype_deepcopy.deepclone;

import java.io.Serializable;

/**
 * @author jehon
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
