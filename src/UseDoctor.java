
public class UseDoctor {

	public static void main(String[] args) {

		ChildSpecialist cs=new ChildSpecialist();
	    System.out.println(Doctor.hospitalName("-------Child Health Care Hospital--------\n"));
        System.out.println(cs.OpenTime("10.00AM-12.00PM", "5.00PM-9.00PM"));
        System.out.println(cs.doctorName("Saravanan"));
        System.out.println(cs.Fees(500, 650));
	}

}
