package edu.mum.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import edu.mum.validation.EmptyOrSize;
import edu.mum.validation.NullMinNumber;


@Entity 
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 	private Long id;
	
	@Column(length = 16)
	@NotEmpty
	private String firstName;
	
	@Column(length = 16)
	@NotEmpty
	@Size(min=5, max = 9, message= "{EmptyOrSize}")
	private String lastName;

	@NullMinNumber(value=6)
	private Integer age;
 	
	@Column(length = 32)
	@NotEmpty
	private String title;
	
	@NullMinNumber(value=6)
 	private Integer memberNumber;

	@OneToOne(fetch=FetchType.LAZY) 
 	@JoinColumn(name="member_id") 
 	UserCredentials userCredentials;
 	
  
 
 	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
 
	
 	public UserCredentials getUserCredentials() {
		return userCredentials;
	}
	public void setUserCredentials(UserCredentials userCredentials) {
		this.userCredentials = userCredentials;
	}
 	public Integer getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(Integer memberNumber) {
		this.memberNumber = memberNumber;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
 	public Integer getAge() {
		return age;
	}

  }
