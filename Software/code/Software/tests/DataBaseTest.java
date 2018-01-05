import org.junit.Before;
import org.junit.Test;

import javax.xml.crypto.Data;

import static org.junit.Assert.*;

public class DataBaseTest {
    @Test
    public void addProduct() throws Exception {
        DataBase.addProduct(new Product("p1",(float)10,"brand"));
        assertTrue(productExists("p1"));
    }

    @Test
    public void removeProduct() throws Exception {
        DataBase.removeProduct("p1");
        assertFalse(productExists("p1"));
    }

    @Test
    public void addStoreTest() throws Exception {
        DataBase.addStore(new Store("s1","online"));
        assertTrue(stroeExists("s1"));
    }

    public boolean productExists(String productName){
        for (Product _product:DataBase.systemProducts) {
            if(productName.equals(_product.name)){
                return true;
            }
        }
        return false;
    }
    public boolean stroeExists(String storeName){
        for (Store _store: DataBase.systemStores) {
            if(_store.name.equals(storeName)){
                return true;
            }
        }
        return false;
    }
}