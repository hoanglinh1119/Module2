package IOFile.Quan_Li_San_Pham;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductManagementMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        ArrayList<ProductManagementObject> listProducts=new ArrayList<>();
       ProducManagement producManagement=new ProducManagement();
       producManagement.InputInformationOfProduct(listProducts);
       producManagement.CreatFileData(scanner,listProducts);
    }

}
