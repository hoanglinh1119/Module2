package IOFile.Quan_Li_San_Pham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductManagementMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap duong link luu file ");
        String link=scanner.nextLine();
        ArrayList<ProductManagementObject> listProducts=new ArrayList<>();
       ProducManagement producManagement=new ProducManagement();
       producManagement.InputInformationOfProduct(listProducts);
       producManagement.CreatFileData(scanner,listProducts,link);
        System.out.println("ban muon them san pham vui long an phim: 1");
        System.out.println("ban muon sua san pham vui long an phim: 2");
        System.out.println("ban muon tim kiem san pham vui long an phim: 3");
        System.out.println("ban muon xoa san pham vui long an phim: 4");
        System.out.println("vui long lua chon thao tac mong muon ");
        int value=scanner.nextInt();
        scanner.nextLine();
        switch (value){
            case 1:producManagement.insertProducts(scanner,listProducts,link);
            break;
            case 2:producManagement.editProducts(scanner,listProducts,link);
            break;
            case 3:producManagement.searchProduct(scanner,listProducts);
            break;
            case 4:producManagement.deleteProduct(scanner,listProducts,link);
            break;
            default:{
                System.out.println("ban da khong lua chon ");
            }
        }





    }

}
