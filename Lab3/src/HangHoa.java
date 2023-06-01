import java.util.Scanner;

public class HangHoa {
	protected String MaHang, TenHang, NhaSanXuat;
	protected int Gia;
	
	public HangHoa(String maHang, String tenHang, String nhaSanXuat, int gia) {
		super();
		this.MaHang = maHang;
		this.TenHang = tenHang;
		this.NhaSanXuat = nhaSanXuat;
		this.Gia = gia;
	}
	public HangHoa() {
		
	}

	public String getMaHang() {
		return MaHang;
	}

	public void setMaHang(String maHang) {
		this.MaHang = maHang;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		this.TenHang = tenHang;
	}

	public String getNhaSanXuat() {
		return NhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.NhaSanXuat = nhaSanXuat;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		this.Gia = gia;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma hang: ");
		this.MaHang = sc.next();
		System.out.print("Nhap ten hang: ");
		this.TenHang = sc.next();
		System.out.print("Nhap nha san xuat: ");
		this.NhaSanXuat = sc.next();
		System.out.print("Nhap gia: ");
		this.Gia = sc.nextInt();
	}

	@Override
	public String toString() {
		return "HangHoa: MaHang: " + MaHang + ", TenHang: " + TenHang + ", NhaSanXuat: " + NhaSanXuat + ", Gia: " + Gia;
	}
	
}
