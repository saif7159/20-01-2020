package com.customer.jdbctemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.datamodel.Customer;
import com.customer.service.Service;
import com.customer.service.ServiceImpl;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Service s = context.getBean("service", ServiceImpl.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        do {
        	System.out.println("Enter choice:\n1. Create Customer\n2. View Customer\n3. Update Email of Customer\n4. Delete Customer\n0. Exit");
            choice = Integer.parseInt(br.readLine());
        	switch(choice)
        	{
        	case 1: System.out.println("Enter first name last name and email");
        	 		String first = br.readLine();
        	 		String last = br.readLine();
        	 		String email = br.readLine();
        	 		s.createCustomer(new Customer(first, last, email));
        	 		break;
        	case 2: System.out.println(s.getAllCustomer());
        			break;
        	case 3: System.out.println("Enter new email and your id:");
        		    String mail = br.readLine();
        		    int id = Integer.parseInt(br.readLine());
        	 		System.out.println(s.updateCustomer(mail, id));
        	 		break;
        	case 4: System.out.println("Enter id to delete record");
        			int delid = Integer.parseInt(br.readLine());
        			System.out.println(s.deleteCustomer(delid));
        			break;
        	case 0: choice = 0;
        			break;
        	default: break;		
        	}
        }while(choice!=0);
        
        
       
    }
}
