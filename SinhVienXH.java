package Day3;

class SinhVienXH extends SinhVien{
    private Double Toan;
    private Double GDCD;

    public SinhVienXH() {
    }
    
    public SinhVienXH(Double Toan, Double GDCD, String type, String national, String name, String college, int age) {
        super(type, national, name, college, age);
        this.Toan = Toan;
        this.GDCD = GDCD;
    }    
    
@Override
public double getDTB(){
    return (GDCD * 2 + Toan)/3;
}
}
