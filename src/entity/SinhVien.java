package entity;

public abstract class SinhVien {
	public static String Truong = "JavaBasic";
	private String Ten;
	private String Khoa;
	private Double DTB;
	public Double getDTB() {
		return DTB;
	}
	public void setDTB(Double dTB) {
		DTB = dTB;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	
	public SinhVien(String Ten, String Khoa){
		this.Ten = Ten;
		this.Khoa = Khoa;
	}
	
}
