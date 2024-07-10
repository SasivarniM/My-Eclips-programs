
public class ChildSpecialist implements Doctor{

	
	public String doctorName(String name) {
		
		return name;
	}
	public String Fees(int fee,int medfee) {
		int tol=fee+medfee;
		return "Consultant Fees and Medicene fee "+tol;
		
	}
	public String OpenTime(String time,String etime) {
		return "Morning: "+time+"\nEveing: "+etime;
	} 

}
