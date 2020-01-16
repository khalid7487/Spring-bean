package dependencyInjection;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author KHALID
 */
public class Employee {

    private Address address1;

    public Address getAddress1() {
        return address1;
    }
    @Required
    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public void show() {
        System.out.println(address1.toString());
    }

}
