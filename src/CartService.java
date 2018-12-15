
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultListModel;

public class CartService {

    public static ArrayList<Cart> getAllProduct(User user) {
        return CartDao.getAllProductCart(user);
    }

    public static boolean addToCart(User user, Product product, int num) {
        return CartDao.addCart(user, product, num);
    }

    public static void showList() {
        User user = UserService.getUser("user1");
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<Cart> list = CartService.getAllProduct(user);
        for (Cart e : list) {
            listModel.addElement(e.toString() + " " + e.getNum());
        }
        CartPage.list1.setModel(listModel);
        CartPage.sumtxt.setText("" + calculatePrice());

    }

    public static void deleteProduct(String id) {
        User user = UserService.getUser("user1");
        CartDao.deleteProduct(user, ProductService.getProduct(id));
        showList();

    }

    public static void showCart() {
        CartPage cart = new CartPage();
        cart.setVisible(true);
    }

    public static int calculatePrice() {
        User user = UserService.getUser("user1");
        ArrayList<Cart> cart = null;
        cart = CartService.getAllProduct(user);
        ArrayList<Integer> total = new ArrayList<>();
        int sum = 0;
        for (Cart e : cart) {
            sum = (e.getProduct().getPrice()) * (e.getNum());
            total.add(sum);
            sum = 0;
        }
        for (int i = 0; i < total.size(); i++) {
            sum += total.get(i);
        }
        return sum;
    }

}
