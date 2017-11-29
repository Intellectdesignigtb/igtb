package com.intellect.cashcore.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="Country")
@Table(name="COUNTRIES_MASTER")
public class Country implements Serializable {
		
		@Id
		@Column(name="BANK_ENTITY_ID")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int bankEntityId;
		
		
		@Column(name="COUNTRY_ISO_CODE")
		private String countryIsoCode;
		
		@Column(name="COUNTRY_ISO_ALPHA_CODE")
		private String countryIsoAlphaCode;
		

		public int getBankEntityId() {
			return bankEntityId;
		}

		public void setBankEntityId(int bankEntityId) {
			this.bankEntityId = bankEntityId;
		}

		public String getCountryIsoCode() {
			return countryIsoCode;
		}

		public void setCountryIsoCode(String countryIsoCode) {
			this.countryIsoCode = countryIsoCode;
		}

		public String getCountryIsoAlphaCode() {
			return countryIsoAlphaCode;
		}

		public void setCountryIsoAlphaCode(String countryIsoAlphaCode) {
			this.countryIsoAlphaCode = countryIsoAlphaCode;
		}

		@Override
		public String toString() {
			return "Country [bankEntityId=" + bankEntityId + ", countryIsoCode=" + countryIsoCode
					+ ", countryIsoAlphaCode=" + countryIsoAlphaCode + "]";
		}
		
		
}
