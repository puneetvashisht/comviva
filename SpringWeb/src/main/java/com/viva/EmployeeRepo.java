package com.viva;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	
	@PersistenceContext
	EntityManager em;
	
	public Employee findEmployee(int id){
//		Session session = sessionFactory.openSession();

		// Manual transactions
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Employee emp = em.find(Employee.class, id);
//		System.out.println(emp);
//		System.out.println(emp.getAddresses());
//		session.get(Employee.class, 1);
		
		//

//		tx.commit();
//		session.close();
		et.commit();
		return emp;
	}

	@Transactional
	public void addEmployee(Employee emp) throws Exception {
		
		em.persist(emp);
//		throw new Exception("Lets rollback this transaction");

		
	}
	
	public List<Employee> findAllEmployees(){
		Query query = em.createNamedQuery("findAllEmployees", Employee.class);
		return query.getResultList();
	}

//	@Override
//	protected void finalize(){
//		HibernateUtil.closeSessionFactory();
//	}
//
//	public void incrementSalary(int i, double salary) {
//		// Physical connection to perform db operations
//				Session session = sessionFactory.openSession();
//
//				// Manual transactions
//				Transaction tx = session.beginTransaction();
//				Employee foundEmployee = session.get(Employee.class, i);
//				System.out.println(foundEmployee);
//				
//				
////				session.get(Employee.class, 1);
//				
//				//
//
//				tx.commit();
//				session.close();
//				
//				
//				foundEmployee.setSalary(salary);
//		
//	}
//
//	public List<Employee> findAllEmployees() {
//		Session session = sessionFactory.openSession();
//		
//		Query query = session.createQuery("select e from Employee e", Employee.class);
//		List<Employee> employees = query.getResultList();
//		session.close();
//		return employees;
//	}
//	
//	public List<Employee> findAllEmployeesGreaterThanSalary(double salary) {
//		Session session = sessionFactory.openSession();
//		
//		Query query = session.createNamedQuery("selectEmployeesGreaterThanSalary", Employee.class);
//		query.setParameter("x", salary);
//		List<Employee> employees = query.getResultList();
//		session.close();
//		return employees;
//	}

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