package com.intellect.cashcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.cashcore.dao.CountryDao;
import com.intellect.cashcore.entities.Country;

@RestController
public class HelloController  {
	
	@Autowired
	private CountryDao countryDao;
	
	@RequestMapping("/hello")
	public String printSomething(){
		countryDao.insertCountry(getCountry());
		return "Working";
	}
	

	@RequestMapping(value = "/save",method=RequestMethod.POST)
	public ResponseEntity<Country> insertCountry(@RequestBody Country country){
			
		countryDao.insertCountry(country);
		return new ResponseEntity<>(country,HttpStatus.OK);
	}
	
	public Country getCountry(){
		
		Country country = new Country();
		country.setCountryIsoAlphaCode("ISOA");
		country.setCountryIsoCode("ISOC");
		return  country;
	}

}
