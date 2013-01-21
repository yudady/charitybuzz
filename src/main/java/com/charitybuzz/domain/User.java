package com.charitybuzz.domain;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2763623236690502422L;

	private Long id;
	private String firstName;
	private String lastName;
	private String screenName;
	private String passWord;
	private String email;
	private String promoCode;

	public User() {
		super();
	}

	public User(Long id, String firstName, String lastName, String screenName,
			String passWord, String email, String promoCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.screenName = screenName;
		this.passWord = passWord;
		this.email = email;
		this.promoCode = promoCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.SIMPLE_STYLE);
	}

}
