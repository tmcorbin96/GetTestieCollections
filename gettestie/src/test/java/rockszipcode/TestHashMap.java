package rockszipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    Map<String,Person> myMap;

    @Before
    public void setUp() {
        myMap = new HashMap<String,Person>();
        myMap.put("Daniel",new Person("Daniel",1996));
        myMap.put("Rebecca",new Person("Rebecca", 1995));
        myMap.put("Robert",new Person("Robert", 1998));
        myMap.put("Malik",new Person("Malik", 1993));
    }

    @Test
    public void testHashMap1() {

        Person newPerson = myMap.get("Robert");
        Assert.assertEquals("Robert",newPerson.getName());
        Assert.assertEquals(1998, newPerson.getYearOfBirth());
    }

    @Test
    public void testHashMapClear() {
        Assert.assertEquals(4,myMap.size());
        myMap.clear();
        Assert.assertTrue(myMap.isEmpty());

    }

    @Test
    public void testHashMapRemove() {
        myMap.remove("Rebecca");
        Assert.assertEquals(3, myMap.size());
        Assert.assertFalse(myMap.containsKey("Rebecca"));
    }




}
