import java.util.Scanner;

public class HangThucPham extends HangHoa {
	private Ngay NgaySanXuat, NgayHetHan;

	
	public HangThucPham(String maHang, String tenHang, String nhaSanXuat, int gia, Ngay ngaySanXuat, Ngay ngayHetHan) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.NgaySanXuat = ngaySanXuat;
		this.NgayHetHan = ngayHetHan;
	}
	public HangThucPham() {
		
	}

	public Ngay getNgaySanXuat() {
		return NgaySanXuat;
	}

	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.NgaySanXuat = ngaySanXuat;
	}

	public Ngay getNgayHetHan() {
		return NgayHetHan;
	}

	public void setNgayHetHan(Ngay ngayHetHan) {
		this.NgayHetHan = ngayHetHan;
	}
	
	Ngay n1 = new Ngay();
	Ngay n2 = new Ngay();
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Ngay san xuat: ");
		n1.Nhap();
		System.out.println("Ngay het han: ");
		n2.Nhap();
	}

	@Override
	public String toString() {
		return "HangThucPham: NgaySanXuat: " + n1.toString() + ", NgayHetHan: " + n2.toString() + "\n" +super.toString();
	}
	
	
}
