package test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        System.out.println("before initializing bean-1");
    }
    public void clear(){
        System.out.println("before destroing bean-1");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("before initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("before destroing bean");
    }
}
