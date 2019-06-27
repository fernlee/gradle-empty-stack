/**
 * Created by yeli on 2019/6/27.
 */
public class IPhone extends Mobile {
    @Override
    public void makeACall(String message) {
        System.out.println("<IPhone>Message : " + message);
    }
}
