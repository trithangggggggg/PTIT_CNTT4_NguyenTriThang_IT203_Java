package Session16.testbtth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product> {
    private List<Product> productList = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) {
            return false;
        }
        if (productMap.containsKey(item.getId())) {
            return false;
        }
        productList.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null || !productMap.containsKey(id)) {
            return false;
        }
        Product removedProduct = productMap.remove(id);
        return productList.remove(removedProduct);
    }

    @Override
    public Product findById(String id) {
        if (id == null) {
            return null;
        }
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }
}
