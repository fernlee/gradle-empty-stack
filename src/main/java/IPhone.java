/**
 * Created by yeli on 2019/6/27.
 */
public class IPhone extends Mobile {
    public IPhone() {

    }

    public IPhone(String name, String color, String brand, int messageLengthLimit) {
        super(name, color, brand, messageLengthLimit);
    }

    @Override
    public void makeACall(String message) {
        super.makeACall(message, "iPhone");
    }
}
