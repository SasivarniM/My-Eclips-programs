
public interface Doctor {
	public String doctorName(String name);
	public String OpenTime(String time,String etime);
	public static String hospitalName(String hosName) {
		return hosName;
	}
	public default String Fees(int fee) {
		return " Fees "+fee;
	}

}
