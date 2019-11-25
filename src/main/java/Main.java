import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        Category category1 = new Category("Vegetais", "Verdes", "Verde");
        Category category2 = new Category("Frutas", "Maduras", "Vermelho");
        Category category3 = new Category("Cereais","Doces","Amarelos");

        Product product1 = new Product("Banana", "maduras", "Imagem", category2, 12, "kg");
        Product product2 = new Product("Cenoura","Fresca","Imagem",category1,18,"kg");
        Product product3 = new Product("Pêra","maduras","Imagem",category2,26,"kg");
        Product product4 = new Product("Estrelitas","Sabor a mel","imagem",category3,45,"un");
        Product product5 = new Product("GoldenGrams","Sabor a mel","Imagem",category3,58,"un");
        Product product6 = new Product("Cebola","Fresca","Imagem",category1,8,"kg");
        Product product7 = new Product("Ananás","Exótico","Imagem",category2,16,"kg");

        Address address1 = new Address("Rua da Boavista","32","4589-568");
        Address address2 = new Address("Rua das Amoras","1D","4235-357");

        User user1 = new User("Andre Vilas","andrevilas@gmail.com","andrevilas12","andre123",address1);
        User user2 = new User("Ana Marta","anamarta@gmail.com","anamarta01","marta543",address2);

        ShoppingList lista1= new ShoppingList("Lista 1",user1,user2);
        ShoppingList lista2= new ShoppingList("Lista 2",user1,user2);

        List<Product> newProductList = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        newProductList.add(product3);
        newProductList.add(product4);
        newProductList.add(product5);
        newProductList.add(product6);
        newProductList.add(product7);
        lista1.setProductlist1(newProductList);

        List<Product> newProductList2 = new ArrayList<>();
        newProductList.add(product1);
        newProductList.add(product2);
        lista1.setProductlist2(newProductList2);

        System.out.println(lista1.getUsername()+"\n"+ lista2.getTotalofproductsonshoppingcart()+"\n"+ lista1.getTotalofproducts());
    }
}