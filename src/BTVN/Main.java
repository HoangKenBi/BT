package BTVN;

public class Main{
    public static void main(String[] args){
        KhachHangVN a = new KhachHangVN(1, "Nguyen Van An", "2022-09-22", 219, "ca Nhan");
        KhachHangNN b = new KhachHangNN(2, "NDonal Trump", "2022-09-21", 156, "US");
        System.out.println(a.thanhTien());
        System.out.println(b.thanhTien());

        KhachHang kh = (KhachHang) new KhachHangVN(2, "Nguyen Van B", "2022-09-22", 100, "ca Nhan");
        System.out.println(kh.thanhTien());

        KhachHangVN khvn = (KhachHangVN)kh;
        System.out.println(khvn.thanhTien());
    }
}
