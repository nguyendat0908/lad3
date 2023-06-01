import java.util.Scanner;

public class HangDienMay extends HangHoa {
	private String timeBaoHanh, dienAp, CongSuat;

	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, int gia, String timeBaoHanh, String dienAp,
			String congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.timeBaoHanh = timeBaoHanh;
		this.dienAp = dienAp;
		this.CongSuat = congSuat;
	}
	public HangDienMay() {
		
	}

	public String getTimeBaoHanh() {
		return timeBaoHanh;
	}

	public void setTimeBaoHanh(String timeBaoHanh) {
		this.timeBaoHanh = timeBaoHanh;
	}

	public String getDienAp() {
		return dienAp;
	}

	public void setDienAp(String dienAp) {
		this.dienAp = dienAp;
	}

	public String getCongSuat() {
		return CongSuat;
	}

	public void setCongSuat(String congSuat) {
		this.CongSuat = congSuat;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap time bao hanh: ");
		timeBaoHanh = sc.next();
		System.out.println("Nhap dien ap: ");
		dienAp = sc.next();
		System.out.println("Nhap cong suat: ");
		CongSuat = sc.next();
	}

	@Override
	public String toString() {
		return "HangDienMay: timeBaoHanh " + timeBaoHanh + ", dienAp " + dienAp + ", CongSuat " + CongSuat;
	}
	
}
