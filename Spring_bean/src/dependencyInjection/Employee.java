package dependencyInjection;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author KHALID
 */
public class Employee {

    private Address address;

    public Address getAddress() {
        return address;
    }
//    @Autowired
//    @Qualifier("addqualifire")
//    @Required
    @Resource(name = "address1")
    public void setAddress(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println(address.toString());
    }

}
