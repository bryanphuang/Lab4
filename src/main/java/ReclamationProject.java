/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 *
 */
public class ReclamationProject {
    /**
     * @param firstInput - first string input
     * @param secondInput - second strig input
     * @return a common substring of both params
     */
    public String findCommonSubstring(final String firstInput, final String secondInput) {

        String shortString = firstInput;
        String longString = secondInput;

        // switches if shortString is longer
        if (shortString.length() > longString.length()) {
            String tempString = shortString;
            shortString = longString;
            longString = tempString;
        }

        String outputString = "";

        for (int shortIndex = 0; shortIndex < shortString.length(); shortIndex++) {
            for (int shortLength = shortString.length() - shortIndex;
                    shortLength > 0; shortLength--) {
                for (int k = 0; k < longString.length() - shortLength; k++) {
                    if (shortString.regionMatches(shortIndex, longString, k, shortLength)
                            && shortLength > outputString.length()) {
                        outputString = shortString.substring(shortIndex, shortIndex + shortLength);
                    }

                }

            }
        }
        return outputString;

    }
}
