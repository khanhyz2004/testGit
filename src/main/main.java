package main;

import java.util.ArrayList;
import entity.SinhVien;
import entity.SinhVienKhoaTuNhien;
import entity.SinhVienKhoaXaHoi;
import enums.codex;
public class main {	
	public static void main(String args []) {
		SinhVienKhoaTuNhien sv1 = new SinhVienKhoaTuNhien("Nam", "Khoa Tu Nhien", 9.5, 5.1, 10.0);
		SinhVienKhoaTuNhien sv2 = new SinhVienKhoaTuNhien("Khanh", "Khoa Tu Nhien", 9.0, 5.5, 10.1);
		SinhVienKhoaTuNhien sv3 = new SinhVienKhoaTuNhien("Tan", "Khoa Tu Nhien", 9.1, 5.1, 10.0);
		SinhVienKhoaXaHoi sv4 = new SinhVienKhoaXaHoi("Kien", "Khoa Xa Hoi", 8.5, 5.5, 10.1);
		SinhVienKhoaXaHoi sv5 = new SinhVienKhoaXaHoi("Thang", "Khoa Xa Hoi", 5.0, 5.0, 5.0);

		ArrayList<SinhVien> listSinhVien = new ArrayList<>();
		listSinhVien.add(sv1);
		listSinhVien.add(sv2);
		listSinhVien.add(sv3);
		listSinhVien.add(sv4);
		listSinhVien.add(sv5);
		System.out.println(".."+codex.soPI.getCode());
//		for(Sinhvien v : listSinhVien.) {
//			System.out.println("sv khoa xh : "+(v.))
//		}
//		arrLstSinhViens.forEach(e -> {
//		e.output();
//	});
		
//	//Tìm SV TN(dưới TB/trên Tb)
//		for (SinhVienKhoaTuNhien v : arrLstSVKTN) {
//			if (v.getToan() < 5 || v.getLy() < 5 || v.getHoa() < 5) {
//			System.out.println("SV TB : "+ (v.getTen()));
//			
//		}else {
//			System.out.println("SV trên TB : "+(v.getTen()));
//		}
//			}
//		
//		for (SinhVienKhoaXaHoi y :arrLstsSVKXH) {
//			if (y.getVan() < 5 || y.getSu() < 5 || y.getDia() < 5) {
//				System.out.println("SV TB : "+ (y.getTen()));
//			}
	
//}
	
		
}
	
}
