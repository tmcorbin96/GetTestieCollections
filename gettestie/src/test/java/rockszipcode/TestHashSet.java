package rockszipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    HashSet<Address> address;

    @Before
    public void setUp() {
        address = new HashSet<Address>();
        address.add(new Address("Wing St", "Wilmington", "19801","USA"));
        address.add(new Address("Blake St", "Greensboro", "27864", "USA"));
        address.add(new Address("Adeline Blvd", "Baklava", "789621", "Denmark"));
    }

    @Test
    public void hashSetTest() {
        address.add(new Address("Delvin St.", "Rockgin", "1-3456", "Austria"));
        Assert.assertTrue(address.size() == 4);
    }



}
