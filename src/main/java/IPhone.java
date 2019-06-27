/**
 * Created by yeli on 2019/6/27.
 */
public class IPhone extends Mobile {
    public IPhone() {

    }

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message) {
        System.out.println("<IPhone>Message : " + message);
    }
}
