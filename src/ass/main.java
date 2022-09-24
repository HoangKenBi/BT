package ass;

import java.util.Scanner;

public class main {

    public static void main(String[] args){

        PhoneBook pb = new PhoneBook();
        pb.insertPhone("ABC", "0123456789");
        pb.insertPhone("DEF", "0123456788");
        pb.insertPhone("ABC", "0123456779");
        pb.insertPhone("DE", "0123456689");
        //pb.removePhone("DEF");
        pb.updatePhone("ABC", "0123345678");
        pb.sort();
        for (String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }

    public static void mainold(String[] args){
        Account myAccount = new Account(1, "Trịnh Quang Hoà", 1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Tiền Muốn Rút:");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rút Thành Công "+x);
        }else{
            System.out.println("Số Dư Tài Khoản Không Đủ Hoặc Nhập Sai Số Tiền"+x);
        }


        Account nam = new Account(2,"Cao Hoàng Nam", 10000);
        System.out.println("Nhập Số Tiền Cần Chuyển Khoản:");
        int y = sc.nextInt();
        if (myAccount.tranferto(nam,y)){
            System.out.println("Chuyển Khoản Thành Công"+x+"Sang Tài Khoản "+nam.getName());
        }else{
            System.out.println("Chuyển Khoản Thất Bại");
        }
    }

    public static void mainOld(String[] args){
        Scanner sc = new Scanner(System.in);
        PhanSo f1 = new PhanSo();
        int ts = sc.nextInt();
        f1.setTuSo(1);
        f1.setMauSo(2);
        f1.inPhanSo();

        PhanSo f2 = new PhanSo();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

    }
}
