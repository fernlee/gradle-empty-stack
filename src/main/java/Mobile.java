/**
 * Created by yeli on 2019/6/27.
 */
public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile() {

    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeACall(String message) {
        System.out.println("Message : " + message);
    }

    public void printBasicInfo() {
        System.out.println(new StringBuilder().append("name: ").append(name).append(" color: ").append(color)
                .append(" brand: ").append(brand));
    }
}
