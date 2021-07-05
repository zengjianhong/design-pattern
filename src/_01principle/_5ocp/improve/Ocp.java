package _01principle._5ocp.improve;

/**
 * @author jehon
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

/**
 * 这是一个用于绘图的类【使用方】
 */
class GraphicEditor {

    public void drawShape(Shape s) { s.draw(); }
}

/**
 * 基类
 */
abstract class Shape {

    public abstract void draw();
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 新增一个图形
 */
class OtherGraphic extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}
