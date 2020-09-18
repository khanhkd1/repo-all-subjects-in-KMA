package ThucHanhBuoi4.Bai1;

public class PhanSo {
    int tuSo;
    int mauSo;

    PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }


    int UCLN(){
        int a = Math.abs(tuSo), b = Math.abs(mauSo);
        while (a*b !=0){
            if (a > b)
                a -= b;
            else b -= a;
        }
        return a + b;
    }

    @Override
    public String toString() {
        if (mauSo==1)
            return Integer.toString(tuSo);
        return tuSo +"\\"+ mauSo;
    }
}
