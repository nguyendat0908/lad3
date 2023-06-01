import java.util.Scanner;

public class HangSanhSu extends HangHoa{
	private String loaiNguyenLieu;

	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, int gia, String loaiNguyenLieu) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	public HangSanhSu() {
		
	}

	public String getLoaiNguyenLieu() {
		return loaiNguyenLieu;
	}

	public void setLoaiNguyenLieu(String loaiNguyenLieu) {
		this.loaiNguyenLieu = loaiNguyenLieu;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap loai nguyen lieu: ");
		loaiNguyenLieu = sc.next();
	}

	@Override
	public String toString() {
		return "HangSanhSu: loaiNguyenLieu " + loaiNguyenLieu;
	}
	
}
