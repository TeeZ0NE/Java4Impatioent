package ch2.sec4;

import java.util.ArrayList;

/**
 * Extended ArrayList fo employers.
 *
 * @param <E> Employee inheritance
 */
public class ArrayListOfStaff<E> extends ArrayList<E> {
    /**
     * Give the sack to employer.
     *
     * @param employee Employee
     * @return Boolean
     */
    protected boolean fireEmployee(Employee employee) {
        return remove(employee);
    }

    /**
     * Check is employee still in staff. The same as contain method
     *
     * @param employee Employee
     * @return Boolean
     */
    public boolean isInStaff(Employee employee) {
        return contains(employee);
    }

    public E getLast() {
        return get(size() - 1);
    }
}
