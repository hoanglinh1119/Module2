package IOFile.Quan_Li_San_Pham;

public class ProductManagementObject {
    private String masanpham;
    private String tensanpham;
    private String hangsanxuat;
    private int giasp;
    private String ngaysanxuat;
    private String hansudung;
    private String huongdansudung;
    private String ngaynhapkho;
    private String ngayxuatkho;
    public ProductManagementObject(){

    }

    public String getNgaynhapkho() {
        return ngaynhapkho;
    }

    public void setNgaynhapkho(String ngaynhapkho) {
        this.ngaynhapkho = ngaynhapkho;
    }

    public String getNgayxuatkho() {
        return ngayxuatkho;
    }

    public void setNgayxuatkho(String ngayxuatkho) {
        this.ngayxuatkho = ngayxuatkho;
    }

    public ProductManagementObject(String masanpham, String tensanpham, String hangsanxuat, int giasp, String ngaysanxuat, String hansudung, String huongdansudung, String ngaynhapkho, String ngayxuatkho){
        this.masanpham=masanpham;
        this.giasp=giasp;
        this.tensanpham=tensanpham;
        this.hangsanxuat=hangsanxuat;
        this.hansudung=hansudung;
        this.ngaysanxuat=ngaysanxuat;
        this.huongdansudung=huongdansudung;
        this.ngaynhapkho=ngaynhapkho;
        this.ngayxuatkho=ngayxuatkho;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public int getGiasp() {
        return giasp;
    }

    public void setGiasp(int giasp) {
        this.giasp = giasp;
    }

    public String getNgaysanxuat() {
        return ngaysanxuat;
    }

    public void setNgaysanxuat(String ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public String getHansudung() {
        return hansudung;
    }

    public void setHansudung(String hansudung) {
        this.hansudung = hansudung;
    }

    public String getHuongdansudung() {
        return huongdansudung;
    }

    public void setHuongdansudung(String huongdansudung) {
        this.huongdansudung = huongdansudung;
    }
    public void disPlay(){
        System.out.printf("%-10s%-20s%-15s%-15s%-50s%-10s%10s%10s%-10s%n",
                getMasanpham(),getHangsanxuat(),getTensanpham(),getGiasp(),getHuongdansudung(),getNgaysanxuat(),
                getHansudung(),getNgaynhapkho(),getNgayxuatkho());
    }

}
