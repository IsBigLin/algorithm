package algorithm;

import java.math.BigDecimal;

/**
 * Created by lnq on 2017/5/22.
 */
public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here

    public Double width;
    public Double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Object getArea() {
        BigDecimal result = new BigDecimal(width).multiply(new BigDecimal(height));
        int dif = result.compareTo(BigDecimal.ZERO);
        if(dif == 0){
            return 0;
        }
        return new BigDecimal(width).multiply(new BigDecimal(height)).doubleValue();
    }

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(1.2,1.3);
        System.out.println(rectangle.getArea());
    }
}
