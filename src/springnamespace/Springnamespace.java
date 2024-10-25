/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package springnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spr.dto.Vehicle;

/**
 *
 * @author HP
 */
public class Springnamespace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("/SpringXMLConfig.xml");//load spring xml file load


Vehicle obj=(Vehicle)context.getBean("Harshdeep");
System.out.println(obj);


//Vehicle obj=(Vehicle)context.getBean("Harshdeep");
//System.out.println(obj.getvNo()+" "+obj.getState()+" "+obj.getOwnerName()+" "+obj.getFuelCategory());

// TODO code application logic here
    }
    
}
