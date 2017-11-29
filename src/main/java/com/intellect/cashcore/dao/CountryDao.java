package com.intellect.cashcore.dao;


import org.apache.log4j.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.intellect.cashcore.entities.Country;



@Repository
public class CountryDao {
	 private static final org.apache.log4j.Logger logger = LogManager.getLogger(CountryDao.class);
	 
		@Autowired
		private SessionFactory sessionFactory;
		
		public void insertCountry(Country country){
			Session session = null;
			try{
				logger.info("In Insert country");
				logger.info("From client"+country);
				session = sessionFactory.openSession();
				session.beginTransaction();
				Integer code = (Integer) session.save(country);
				logger.info("country Created successfully"+code);
				session.getTransaction().commit();
			}catch(Exception e){
					logger.info("Exception in country Dao"+e);
			}
		}
}
