class User{
	
	String username;
	String email;
	String department;
	String jobTitle;
	String reportTo;

	User(String username, String email, String department, String jobTitle, String reportTo){
		this.username = username;
		this.password = password;
		this.email = email;
		this.jobTitle = jobTitle;
	}

	String getUsername(){
		return username;
	}

	String getEmail(){
		return email;
	}

	String getDepartment(){
		return department;
	}

	String getJobTitle(){
		return jobTitle;
	}

	String getReportTo(){
		return reportTo;
	}
}
