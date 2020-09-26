package OOP_nam3.Buoi4.Bai2;

public class testENUM {

    public enum XEPLOAI{
        GIOI, KHA, TRUNGBINH, YEU;
    }

    public static void main(String[] args) {
        XEPLOAI a = XEPLOAI.KHA;
        System.out.println(a.ordinal());

    }
}
