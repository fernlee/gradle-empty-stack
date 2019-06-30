/**
 * Created by yeli on 2019/6/28.
 */
public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void makeACall(String message) {
        mobile.makeACall(message);
    }


    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
