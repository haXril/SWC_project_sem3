package projectPackage;

public class Citizen {

	private String ic;
	private String name;
	private int age;
	private String state;
	private String Category;
	private String firstDoseStatus;
	private String secondDoseStatus;
	private String certificate;
	
	
	public Citizen() {
		this.ic = "";
		this.name = "";
		this.age = 0;
		this.state = "";
		this.Category = "";
		this.firstDoseStatus = null;
		this.secondDoseStatus = null;
		this.certificate = null;
	}
	
	public Citizen(String ic,String name,int age,String state,String Category,String firstDoseStatus,String secondDoseStatus,String certificate) {
		this.ic = "";
		this.name = "";
		this.age = 0;
		this.state = "";
		this.Category = "";
		this.firstDoseStatus = null;
		this.secondDoseStatus = null;
		this.certificate = null;
	}
	
	public void setInformationPatient(String i,String n,int a,String t,String c,String f,String s,String cer) {
		ic = i;
		name = n;
		age = a;
		state = t;
		Category =c;
		firstDoseStatus = f;
		secondDoseStatus = s;
		certificate = cer;
	}
	
	public void setIc(String i) {
		ic = i;
	}
	
	public void setName(String n) {
		name= n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setState(String t) {
		state = t;
	}
	
	public void setCategory(String c) {
		Category = c;
	}
	
	public void setFirstDoseStatus(String f) {
		firstDoseStatus = f;
	}
	
	public void setSecondDoseStatus(String s) {
		secondDoseStatus = s;
	}
	
	public void setCertificate(String cer) {
		certificate = cer;
	}
	
	public String getIc(String i) {
		return ic;
	}
	
	public String getName(String n) {
		return name;
	}
	
	public int getAge(int a) {
		return age;
	}
	
	public String getState(String t) {
		return state;
	}
	
	public String getCategory(String c) {
		return Category;
	}
	
	public String getFirstDoseStatus(String f) {
		return firstDoseStatus;
	}
	
	public String getSecondDoseStatus(String s) {
		return secondDoseStatus;
	}
	
	public String getCertificate(String cer) {
		return certificate;
	}
	
	
	public String toString() {
		return "\n\nIc : "+ic+"\nName : "+name +"\nAge : "+age+"\nState : "+state+"\nCategory : " +Category+"\n1st Dose Status : "+firstDoseStatus+ "\n2nd Dose Status : "+secondDoseStatus+ "\nCertificate : "+certificate;
	}
}
