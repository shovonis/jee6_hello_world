package bean;

import javax.ejb.Stateless;

/**
 * @author rifatul.islam
 * @since 6/29/14.
 */
@Stateless(name = "HelloWorldEJB")
public class HelloWorldBean {
    public HelloWorldBean() {
    }

    public String sayHello() {
        return "Hello, World!";
    }
}
