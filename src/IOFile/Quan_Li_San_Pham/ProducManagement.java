package IOFile.Quan_Li_San_Pham;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProducManagement extends ProductManagementObject {
    public void InputInformationOfProduct(ArrayList<ProductManagementObject>listProducts){
        Scanner information=new Scanner(System.in);
        try {
            System.out.println("nhap so luong san pham can nhap");
            int amountProduct=information.nextInt();
            information.nextLine();
            for (int i=0;i<amountProduct;i++){
                System.out.println("nhap ma san pham");
                String masanpham=information.nextLine();
                System.out.println("nhap ten san pham");
                String tensanpham=information.nextLine();
                System.out.println("nhap hang san pham");
                String hangsanxuat=information.nextLine();
                System.out.println("nhap gia san pham");
                int giasp=information.nextInt();
                information.nextLine();
                System.out.println("nhap ngay san xuat san pham");
                String ngaysanxuat= information.nextLine();
                System.out.println("nhap han su dung cua san pham");
                String hansudung= information.nextLine();
                System.out.println("nhap huong dan su dung cua san pham");
                String huongdansd=information.nextLine();
                System.out.println("nhap ngay nhap kho san pham");
                String ngaynhapkho= information.nextLine();
                System.out.println("nhap ngay xuat kho san pham");
                String ngayxuatkho= information.nextLine();
                ProductManagementObject object=new ProductManagementObject(masanpham,tensanpham,hangsanxuat,giasp,
                        ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
                listProducts.add(object);
            }
            for (ProductManagementObject listProduct : listProducts) {
                listProduct.disPlay();
            }

        } catch (InputMismatchException e){
            System.out.println(" vui long nhap dung kieu du lieu");
        }
    }
    public void insert(Scanner scanner,ArrayList<ProductManagementObject>listProducts){

    }
    public  void CreatFileData(Scanner scanner, ArrayList<ProductManagementObject> listProducts) throws IOException {
        System.out.println("nhap duong link luu file ");
        String link=scanner.nextLine();
        File file=new File(link);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (ProductManagementObject listProduct : listProducts) {
            bufferedWriter.write(listProduct.getMasanpham()+"  ");
            bufferedWriter.write(listProduct.getTensanpham()+"  ");
            bufferedWriter.write(listProduct.getHangsanxuat()+"  ");
            bufferedWriter.write(listProduct.getGiasp()+"  ");
            bufferedWriter.write(listProduct.getNgaysanxuat()+"  ");
            bufferedWriter.write(listProduct.getHansudung()+"  ");
            bufferedWriter.write(listProduct.getHuongdansudung()+"  ");
            bufferedWriter.write(listProduct.getNgaynhapkho()+"  ");
            bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"/n");


        }
        bufferedWriter.close();
        fileWriter.close();
    }

}
