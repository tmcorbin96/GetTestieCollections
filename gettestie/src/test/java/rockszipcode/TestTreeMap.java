package rockszipcode;

import org.junit.Before;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    Map<Integer, Person> employee;

    @Before
    public void setUp() {
        employee = new TreeMap<Integer, Person>();
        employee.put(1, new Person("Daniel", 1978));

    }
}
