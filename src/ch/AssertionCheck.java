package ch;

/**
 * Check of Assertion without global VM -ea.
 */
public class AssertionCheck {
    private AssertionCheck() {
    }

    /**
     * Throw assertion if not a condition.
     *
     * @param condition Checked condition
     * @param msg       What message do developer'll see
     * @throws AssertionError check condition and return provided message
     */
    public static void assertion(boolean condition, String msg) throws AssertionError {
        if (!condition) {
            throw new AssertionError(msg);
        }
    }
}
