package com.viva;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EmployeeRepo {
	static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtil.getSessionFactory();
	}

	public void addEmployee(Employee emp) {
		// Physical connection to perform db operations
		Session session = sessionFactory.openSession();

		// Manual transactions
		Transaction tx = session.beginTransaction();
		session.save(emp);
		
//		session.get(Employee.class, 1);
		
		//

		tx.commit();
		session.close();
		
	}

	@Override
	protected void finalize(){
		HibernateUtil.closeSessionFactory();
	}

//	public Employee findEmployee(int id) {
//		// Physical connection to perform db operations
//		
//		//EntityManager
//		Session session = sessionFactory.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		Employee emp = session.get(Employee.class, id);
//		emp.setName("Zane");
//		
//		Set<Address> addresses = emp.getAddresses();
//		System.out.println(addresses);
//		
//		
//		//Persistent state
////		for(Address address: addresses){
////			Employee e = address.getEmployee();
////			e.setName("Shivam");
////		}
//		
//		
////		Address newAddress = new Address();
////		newAddress.setCity("Delhi");
////		newAddress.setLocation("CP");
////		newAddress.setEmployee(emp);
////		emp.setAddresses(addresses);
////		
////		addresses.add(newAddress);
//		
//		tx.commit();
//		session.close();
//		return emp;
//			
//		
//	}

}
