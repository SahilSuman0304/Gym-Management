package memberPojo;

public class Member 
{
    private int id;
    private String name,surname,address,mobile,email,gender,age,gymTime,admissionFee,date;
    
    public Member()
    {
    	
    }
    
	public Member(String name, String surname,String address, String mobile, String email, String gender, String age, String gymTime,
			String admissionFee,String date) {
		super();
		this.name = name;
		this.surname = surname;
		this.address=address;
		this.mobile = mobile;
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.gymTime = gymTime;
		this.admissionFee = admissionFee;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGymTime() {
		return gymTime;
	}

	public void setGymTime(String gymTime) {
		this.gymTime = gymTime;
	}

	public String getAdmissionFee() {
		return admissionFee;
	}

	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
}
