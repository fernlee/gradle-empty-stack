/**
 * Created by yeli on 2019/6/27.
 */
public class Mobile {
    private String name;
    private String color;
    private String brand;
    private int messageLengthLimit = 10;

    public Mobile() {

    }

    public Mobile(String name, String color, String brand, int messageLengthLimit) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.messageLengthLimit = messageLengthLimit;
    }

    public void makeACall(String message, String type) {
        String prefix = "";
        if (!type.equals("mobile")) {
            prefix = "<" + type + ">";
        }
        if (message.length() > messageLengthLimit) {
            System.out.println(prefix + " Message cannot be sent");
        } else {
            System.out.println(prefix + "Message : " + message);
        }

    }

    public void makeACall(String message) {
        makeACall(message, "mobile");
    }

    public void printBasicInfo() {
        System.out.println(new StringBuilder().append("name: ").append(name).append(" color: ").append(color)
                .append(" brand: ").append(brand));
    }
}
