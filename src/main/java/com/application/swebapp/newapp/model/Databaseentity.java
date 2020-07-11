package com.application.swebapp.newapp.model;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userhire")
public class Databaseentity 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  	private Integer PersonID;
	    private String Lastname;
	    private String Firstname;
	    private String Useraddress;
	    private String Email;
	    private String Userlocation;
	    private String Gender;
	    private String Userpassword;
	    public Databaseentity() {
	    }

	    public Databaseentity(Integer PersonID,String Lastname, String Firstaame,String Email,String Useraddress,
	    		String Userlocation,String Gender,String Userpassword) {
	        this.PersonID = PersonID;
	        this.Lastname = Lastname;
	        this.Firstname = Firstname;
	        this.Useraddress = Useraddress;
	        this.Email = Email;
	        this.Userlocation = Userlocation;
	        this.Gender = Gender;
	        this.Userpassword = Userpassword;
	    }

       public String getEmail() {
		return Email;
	}
       public void setEmail(String email) {
		Email = email;
	}
       public String getFirstName() {
		return Firstname;
	}
       public void setFirstName(String firstname) {
		Firstname = firstname;
	}
       public String getLastName() {
		return Lastname;
	}
       public void setLastName(String lastname) {
		Lastname = lastname;
	}
       public String getGender() {
		return Gender;
	}
       public void setGender(String gender) {
		Gender = gender;
	}
       public Integer getPersonID() {
		return PersonID;
	}
       public void setPersonID(Integer personID) {
		PersonID = personID;
	}
       public String getUserAddress() {
		return Useraddress;
	}
       public void setUserAddress(String useraddress) {
		Useraddress = useraddress;
	}
       public String getUserLocation() {
		return Userlocation;
	}
        public void setUserLocation(String userlocation) {
			Userlocation = userlocation;
		}
        public String getUserPassword() {
			return Userpassword;
		}
        public void setUserPassword(String userpassword) {
			Userpassword = userpassword;
		}
	    @Override
	    public String toString() {
	    	System.out.println("Inside entity");
            HashMap<String, String> login = new HashMap<String, String>();
            login.put(Email, Userpassword);
	        return login.toString();// returning key value pairs
	    }
}
