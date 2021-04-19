package com.ar.test;

import java.util.Scanner;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.ar.controller.MainController;
import com.ar.vo.PatientVO;

public class App 
{
    public static void main( String[] args )
    {
    	//Read inputs from enduser as string values
    			Scanner sc=new Scanner(System.in);
    			System.out.println("enter Patient name::");
    			String patientName=sc.next();
    			System.out.println("enter Patient addrs::");
    			String patientAddrs=sc.next();
    			System.out.println("enter mobileNo::");
    			String mobileNo=sc.next();
    			System.out.println("enter noofhospitalizedday::");
    			String noofhospitalizedday=sc.next();
    			System.out.println("enter  billperday::");
    			String billperday=sc.next();
    			
    			//create CustomerVO clas obj
    			PatientVO vo=new PatientVO();
    			vo.setPatientName(patientName);vo.setPatientAddrs(patientAddrs); vo.setMobileNo(mobileNo);
    			vo.setNoofhospitalizedday(noofhospitalizedday); vo.setBillperday(billperday);
    			//create IOC container
    			 DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    			 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    			 reader.loadBeanDefinitions("com/ar/cfgs/applicationContext.xml");
    			 //get Controller class obj 
    			 MainController controller=factory.getBean("controller",MainController.class);
    			 //invoke the methods
    			 try {
    				 String result=controller.processCustomer(vo);
    				 System.out.println(result);
    			 }
    			 catch(Exception e) {
    				 //e.printStackTrace();
    				 System.out.println("Internal Problem --Try Again:::"+e.getMessage());
    			 }
    }
}
