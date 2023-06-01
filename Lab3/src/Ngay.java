import java.util.Scanner;

public class Ngay {
	private int Ngay, Thang, Nam;

	public Ngay(int ngay, int thang, int nam) {
		this.Ngay = ngay;
		this.Thang = thang;
		this.Nam = nam;
	}
	public Ngay() {
		
	}

	public int getNgay() {
		return Ngay;
	}

	public void setNgay(int ngay) {
		this.Ngay = ngay;
	}

	public int getThang() {
		return Thang;
	}

	public void setThang(int thang) {
		this.Thang = thang;
	}

	public int getNam() {
		return Nam;
	}

	public void setNam(int nam) {
		this.Nam = nam;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ngay: ");
		Ngay = sc.nextInt();
		System.out.print("Nhap thang: ");
		Thang = sc.nextInt();
		System.out.print("Nhap nam: ");
		Nam = sc.nextInt();
	}

	@Override
	public String toString() {
		return Ngay + " - " + Thang + " - " + Nam;
	}
	
}
