package BTVN8;

public abstract class Phone {
    public abstract void insertPhone(String name, String phone);

    public abstract void removePhone(String name);

    public abstract void updatePhone(String name,String newphone);

    public abstract String searchPhone(String name);

    public abstract void sort();
}
