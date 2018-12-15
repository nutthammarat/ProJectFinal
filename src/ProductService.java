import java.util.*;
import javax.swing.ImageIcon;

public abstract class ProductService {

    public static ArrayList<Product> showAllProduct() {
        return ProductDao.getAllProducts();
    }

    public static Product getProduct(String pId) {
        return ProductDao.getProduct(pId);
    }
    
    public static boolean addProduct(Product product){
        return ProductDao.addProduct(product);
    }
    public static void getInfo(){
         ArrayList<Product> product = ProductService.showAllProduct();
        int i = 0;
        for (Product e : product) {
            Product product1 = ProductService.getProduct(e.getId());
            if (i == 0) {
                MainPage.x10.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S01);
                MainPage.x1.setIcon(icon);
            } else if (i == 1) {
                MainPage.x11.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S02);
                MainPage.x2.setIcon(icon);
            } else if (i == 2) {
                MainPage.x12.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S03);
                MainPage.x3.setIcon(icon);
            } else if (i == 3) {
                MainPage.x13.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S04);
                MainPage.x4.setIcon(icon);
            } else if (i == 4) {
                MainPage.x14.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S05);
                MainPage.x5.setIcon(icon);
            } else if (i == 5) {
                MainPage.x15.setText(product1.getName().toUpperCase());
                ImageIcon icon = new ImageIcon(ProductDetailService.S06);
                MainPage.x6.setIcon(icon);
                break;
            }
            //MainPage.x1.setText(""+product1.getImage());
            i++;
        }
    }
}