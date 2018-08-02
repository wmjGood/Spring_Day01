package cn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

    private String who=null;
    public String getWho() {
        return who;
    }
    public void setWho(String who) {
        this.who = who;
    }
     //wumengjie

    public  void  print(){
        System.out.println("hello,"+getWho());
    }


    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloSpring helloSpring=(HelloSpring)context.getBean("helloWorld");
        helloSpring.print();
    }
}
