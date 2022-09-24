package BTVN8;

import ass.PhoneBook;

public class Main {
    public static void main(String[] args){

        ass.PhoneBook pb = new PhoneBook();
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
}
