package IOFile.Quan_Li_San_Pham;

import sun.awt.image.ImageWatched;

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
    public void searchProduct(Scanner scanner,ArrayList<ProductManagementObject>listProducts){
            System.out.println("tim theo ten san pham : Enter 1 ");
            System.out.println("tim theo ma san pham : Enter 2 ");
            System.out.println("tim theo gia san pham : Enter 3 ");
            System.out.println("tim theo hang san xuat : Enter 4 ");
            System.out.println("vui long chon cach tim kiem: ");
            int luachon1=scanner.nextInt();
            scanner.nextLine();
            switch (luachon1){
                case 1:
                    System.out.println("nhap ten san pham: ");
                    String tensanpham=scanner.nextLine();
                    boolean notMatchingInformation=true;
                   try {
                       for (ProductManagementObject listProduct : listProducts) {
                           if (listProduct.getTensanpham().equals(tensanpham)) {
                               listProduct.disPlay();
                               notMatchingInformation = false;
                           }
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
                    if (notMatchingInformation){
                        System.out.println("khong tim thay ");
                    }
                    break;
                case 2:
                    System.out.println("nhap ma san pham: ");
                    String id=scanner.nextLine();
                    boolean notMatchingName=true;
                    try {
                        for (ProductManagementObject listProduct : listProducts) {
                            if (listProduct.getMasanpham().equals(id)) {
                                listProduct.disPlay();
                                notMatchingName = false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(notMatchingName){
                        System.out.println(" khong tim thay");
                    }
                    break;
                case 3:
                    System.out.println("nhap gia san pham ");
                    int gia=scanner.nextInt();
                    scanner.nextLine();
                    boolean notMatchingId=true;
                    try {
                        for (ProductManagementObject listProduct : listProducts) {
                            if (listProduct.getGiasp() == gia) {
                                listProduct.disPlay();
                                notMatchingId = false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (notMatchingId){
                        System.out.println(" khong tim thay");
                    }
                    break;
                case 4:
                    System.out.println("nhap hang san xuat: ");
                    String hangsx= scanner.nextLine();
                    boolean notMatchingYears=true;
                    try {
                        for (ProductManagementObject listProduct : listProducts) {
                            if (listProduct.getHangsanxuat().equals(hangsx)) {
                                listProduct.disPlay();
                                notMatchingYears = false;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (notMatchingYears){
                        System.out.println("khong tim thay");
                    }
                    break;
                default:
                    System.out.println("ban da khong chon tim kiem");
            }
    }
    public void insertProducts(Scanner scanner, ArrayList<ProductManagementObject>listProducts, String link) throws IOException {
        System.out.println("nhap so luong san pham ban muon them: ");
        int insertNumber=scanner.nextInt();
        scanner.nextLine();
        for (int i=0;i<insertNumber;i++){
            System.out.println("nhap ma san pham");
            String masanpham=scanner.nextLine();
            System.out.println("nhap ten san pham");
            String tensanpham=scanner.nextLine();
            System.out.println("nhap hang san pham");
            String hangsanxuat=scanner.nextLine();
            System.out.println("nhap gia san pham");
            int giasp=scanner.nextInt();
            scanner.nextLine();
            System.out.println("nhap ngay san xuat san pham");
            String ngaysanxuat= scanner.nextLine();
            System.out.println("nhap han su dung cua san pham");
            String hansudung= scanner.nextLine();
            System.out.println("nhap huong dan su dung cua san pham");
            String huongdansd=scanner.nextLine();
            System.out.println("nhap ngay nhap kho san pham");
            String ngaynhapkho= scanner.nextLine();
            System.out.println("nhap ngay xuat kho san pham");
            String ngayxuatkho= scanner.nextLine();
            ProductManagementObject object=new ProductManagementObject(masanpham,tensanpham,hangsanxuat,giasp,
                    ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
            listProducts.add(object);
            File file=new File(String.valueOf(link));
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
                bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        }
    }
    public void editProducts(Scanner scanner,ArrayList<ProductManagementObject>listProducts,String link){
        System.out.println("sua theo ten san pham : Enter 1 ");
        System.out.println("sua theo ma san pham : Enter 2 ");
        System.out.println("sua theo gia san pham : Enter 3 ");
        System.out.println("sua theo hang san xuat : Enter 4 ");
        System.out.println("vui long chon cach de sua : ");
        int luachon1=scanner.nextInt();
        scanner.nextLine();
        switch (luachon1){
            case 1:
                System.out.println("nhap ten san pham: ");
                String tensanpham=scanner.nextLine();
                boolean notMatchingInformation=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getTensanpham().equals(tensanpham)) {
                            System.out.println("nhap ma san pham");
                            String masanpham=scanner.nextLine();
                            System.out.println("nhap ten san pham");
                            String tensp=scanner.nextLine();
                            System.out.println("nhap hang san pham");
                            String hangsanxuat=scanner.nextLine();
                            System.out.println("nhap gia san pham");
                            int giasp=scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("nhap ngay san xuat san pham");
                            String ngaysanxuat= scanner.nextLine();
                            System.out.println("nhap han su dung cua san pham");
                            String hansudung= scanner.nextLine();
                            System.out.println("nhap huong dan su dung cua san pham");
                            String huongdansd=scanner.nextLine();
                            System.out.println("nhap ngay nhap kho san pham");
                            String ngaynhapkho= scanner.nextLine();
                            System.out.println("nhap ngay xuat kho san pham");
                            String ngayxuatkho= scanner.nextLine();
                            ProductManagementObject object=new ProductManagementObject(masanpham,tensp,hangsanxuat,giasp,
                                    ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
                            listProducts.set(i,object);
                            File file=new File(String.valueOf(link));
                            FileWriter fileWriter=new FileWriter(file);
                            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                            for (ProductManagementObject listProduct1 : listProducts) {
                                bufferedWriter.write(listProduct1.getMasanpham()+"  ");
                                bufferedWriter.write(listProduct1.getTensanpham()+"  ");
                                bufferedWriter.write(listProduct1.getHangsanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getGiasp()+"  ");
                                bufferedWriter.write(listProduct1.getNgaysanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getHansudung()+"  ");
                                bufferedWriter.write(listProduct1.getHuongdansudung()+"  ");
                                bufferedWriter.write(listProduct1.getNgaynhapkho()+"  ");
                                bufferedWriter.write(listProduct1.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingInformation = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingInformation){
                    System.out.println("khong tim thay ");
                }
                break;
            case 2:
                System.out.println("nhap ma san pham: ");
                String id=scanner.nextLine();
                boolean notMatchingName=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getMasanpham().equals(id)) {
                            System.out.println("nhap ma san pham");
                            String masanpham=scanner.nextLine();
                            System.out.println("nhap ten san pham");
                            String tensp=scanner.nextLine();
                            System.out.println("nhap hang san pham");
                            String hangsanxuat=scanner.nextLine();
                            System.out.println("nhap gia san pham");
                            int giasp=scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("nhap ngay san xuat san pham");
                            String ngaysanxuat= scanner.nextLine();
                            System.out.println("nhap han su dung cua san pham");
                            String hansudung= scanner.nextLine();
                            System.out.println("nhap huong dan su dung cua san pham");
                            String huongdansd=scanner.nextLine();
                            System.out.println("nhap ngay nhap kho san pham");
                            String ngaynhapkho= scanner.nextLine();
                            System.out.println("nhap ngay xuat kho san pham");
                            String ngayxuatkho= scanner.nextLine();
                            ProductManagementObject object=new ProductManagementObject(masanpham,tensp,hangsanxuat,giasp,
                                    ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
                            listProducts.set(i,object);
                            File file=new File(String.valueOf(link));
                            FileWriter fileWriter=new FileWriter(file);
                            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                            for (ProductManagementObject listProduct1 : listProducts) {
                                bufferedWriter.write(listProduct1.getMasanpham()+"  ");
                                bufferedWriter.write(listProduct1.getTensanpham()+"  ");
                                bufferedWriter.write(listProduct1.getHangsanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getGiasp()+"  ");
                                bufferedWriter.write(listProduct1.getNgaysanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getHansudung()+"  ");
                                bufferedWriter.write(listProduct1.getHuongdansudung()+"  ");
                                bufferedWriter.write(listProduct1.getNgaynhapkho()+"  ");
                                bufferedWriter.write(listProduct1.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingName = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(notMatchingName){
                    System.out.println(" khong tim thay");
                }
                break;
            case 3:
                System.out.println("nhap gia san pham ");
                int gia=scanner.nextInt();
                scanner.nextLine();
                boolean notMatchingId=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getGiasp()==gia) {
                            System.out.println("nhap ma san pham");
                            String masanpham=scanner.nextLine();
                            System.out.println("nhap ten san pham");
                            String tensp=scanner.nextLine();
                            System.out.println("nhap hang san pham");
                            String hangsanxuat=scanner.nextLine();
                            System.out.println("nhap gia san pham");
                            int giasp=scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("nhap ngay san xuat san pham");
                            String ngaysanxuat= scanner.nextLine();
                            System.out.println("nhap han su dung cua san pham");
                            String hansudung= scanner.nextLine();
                            System.out.println("nhap huong dan su dung cua san pham");
                            String huongdansd=scanner.nextLine();
                            System.out.println("nhap ngay nhap kho san pham");
                            String ngaynhapkho= scanner.nextLine();
                            System.out.println("nhap ngay xuat kho san pham");
                            String ngayxuatkho= scanner.nextLine();
                            ProductManagementObject object=new ProductManagementObject(masanpham,tensp,hangsanxuat,giasp,
                                    ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
                            listProducts.set(i,object);
                            File file=new File(String.valueOf(link));
                            FileWriter fileWriter=new FileWriter(file);
                            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                            for (ProductManagementObject listProduct1 : listProducts) {
                                bufferedWriter.write(listProduct1.getMasanpham()+"  ");
                                bufferedWriter.write(listProduct1.getTensanpham()+"  ");
                                bufferedWriter.write(listProduct1.getHangsanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getGiasp()+"  ");
                                bufferedWriter.write(listProduct1.getNgaysanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getHansudung()+"  ");
                                bufferedWriter.write(listProduct1.getHuongdansudung()+"  ");
                                bufferedWriter.write(listProduct1.getNgaynhapkho()+"  ");
                                bufferedWriter.write(listProduct1.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingId = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingId){
                    System.out.println(" khong tim thay");
                }
                break;
            case 4:
                System.out.println("nhap hang san xuat: ");
                String hangsx= scanner.nextLine();
                boolean notMatchingYears=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getTensanpham().equals(hangsx)) {
                            System.out.println("nhap ma san pham");
                            String masanpham=scanner.nextLine();
                            System.out.println("nhap ten san pham");
                            String tensp=scanner.nextLine();
                            System.out.println("nhap hang san pham");
                            String hangsanxuat=scanner.nextLine();
                            System.out.println("nhap gia san pham");
                            int giasp=scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("nhap ngay san xuat san pham");
                            String ngaysanxuat= scanner.nextLine();
                            System.out.println("nhap han su dung cua san pham");
                            String hansudung= scanner.nextLine();
                            System.out.println("nhap huong dan su dung cua san pham");
                            String huongdansd=scanner.nextLine();
                            System.out.println("nhap ngay nhap kho san pham");
                            String ngaynhapkho= scanner.nextLine();
                            System.out.println("nhap ngay xuat kho san pham");
                            String ngayxuatkho= scanner.nextLine();
                            ProductManagementObject object=new ProductManagementObject(masanpham,tensp,hangsanxuat,giasp,
                                    ngaysanxuat,hansudung,huongdansd,ngaynhapkho,ngayxuatkho);
                            listProducts.set(i,object);
                            File file=new File(String.valueOf(link));
                            FileWriter fileWriter=new FileWriter(file);
                            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                            for (ProductManagementObject listProduct1 : listProducts) {
                                bufferedWriter.write(listProduct1.getMasanpham()+"  ");
                                bufferedWriter.write(listProduct1.getTensanpham()+"  ");
                                bufferedWriter.write(listProduct1.getHangsanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getGiasp()+"  ");
                                bufferedWriter.write(listProduct1.getNgaysanxuat()+"  ");
                                bufferedWriter.write(listProduct1.getHansudung()+"  ");
                                bufferedWriter.write(listProduct1.getHuongdansudung()+"  ");
                                bufferedWriter.write(listProduct1.getNgaynhapkho()+"  ");
                                bufferedWriter.write(listProduct1.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingYears = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingYears){
                    System.out.println("khong tim thay");
                }
                break;
            default:
                System.out.println("ban da khong chon tim kiem");
        }
    }
    public void deleteProduct(Scanner scanner,ArrayList<ProductManagementObject> listProducts,String link){
        System.out.println("xoa theo ten san pham : Enter 1 ");
        System.out.println("xoa theo ma san pham : Enter 2 ");
        System.out.println("xoa theo gia san pham : Enter 3 ");
        System.out.println("xoa theo hang san xuat : Enter 4 ");
        System.out.println("vui long chon cach de sua : ");
        int luachon1=scanner.nextInt();
        scanner.nextLine();
        switch (luachon1){
            case 1:
                System.out.println("nhap ten san pham: ");
                String tensanpham=scanner.nextLine();
                boolean notMatchingInformation=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getTensanpham().equals(tensanpham)) {
                            listProducts.remove(i);
                            File file=new File(String.valueOf(link));
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
                                bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingInformation = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingInformation){
                    System.out.println("khong tim thay ");
                }
                break;
            case 2:
                System.out.println("nhap ma san pham: ");
                String id=scanner.nextLine();
                boolean notMatchingName=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getMasanpham().equals(id)) {
                            listProducts.remove(i);
                            File file=new File(String.valueOf(link));
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
                                bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingName = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if(notMatchingName){
                    System.out.println(" khong tim thay");
                }
                break;
            case 3:
                System.out.println("nhap gia san pham ");
                int gia=scanner.nextInt();
                scanner.nextLine();
                boolean notMatchingId=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getGiasp()==gia) {
                            listProducts.remove(i);
                            File file=new File(String.valueOf(link));
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
                                bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingId = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingId){
                    System.out.println(" khong tim thay");
                }
                break;
            case 4:
                System.out.println("nhap hang san xuat: ");
                String hangsx= scanner.nextLine();
                boolean notMatchingYears=true;
                try {
                    for (int i=0;i<listProducts.size();i++) {
                        if (listProducts.get(i).getHangsanxuat().equals(hangsx)) {
                            listProducts.remove(i);
                            File file=new File(String.valueOf(link));
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
                                bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
                            }
                            bufferedWriter.close();
                            fileWriter.close();
                            notMatchingYears = false;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (notMatchingYears){
                    System.out.println("khong tim thay");
                }
                break;
            default:
                System.out.println("ban da khong chon tim kiem");
        }
    }
    public  void CreatFileData(Scanner scanner, ArrayList<ProductManagementObject> listProducts, String link) throws IOException {
        File file=new File(String.valueOf(link));
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
            bufferedWriter.write(listProduct.getNgayxuatkho()+"  "+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
