/**
 * Created by yeli on 2019/6/27.
 */
public class Andriod extends Mobile {
    public Andriod() {

    }
    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message) {
        System.out.println("<Andriod>Message : " + message);
    }
}
