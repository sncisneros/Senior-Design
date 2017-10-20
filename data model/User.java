package UAS
import java.util.*

public class User{
	
	long id;
	String userName;
	String firstName;
	String lastName
	String email;
	int phoneNumber;
	Department department;

	User(long id, String userName, String firstName, String lastName, String email, int phoneNumber, Department department){
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber
		this.department = department;
	}

	long getId() {
		return id;
	}

	String getFirstName(){
		return firstName;
	}

	String getLastName(){
		return lastName;
	}

	String getEmail(){
		return email;
	}

	int getPhoneNumber(){
		return phoneNumber;
	}

	Department getDepartment(){
		return department;
	}

	void setUserName(String userName){
		this.userName = userName;
	}

	void setFirstName(String firstName){
		this.firstName = firstName;
	}

	void setLastName(String lastName){
		this.lastName = lastName;
	}

	void setEmail(String email){
		this.email = email;
	}

	void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	void setDepartment(Department department){
		this.department = department;
	}


}
