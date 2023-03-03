public class CompareVersions {
    // O(n) - time complexity | O(n) - space complexity
    public static int compareVersions(String version1, String version2) {
        // create arrays to store each number
        String[] arr1 = version1.split("\\."); // the 'dot' character does not represent a decimal point, so use the regular expression
        String[] arr2 = version2.split("\\.");

        int i = 0;
        // iterate each number
        while (i < arr1.length && i < arr2.length) {
            int num1 = Integer.parseInt(arr1[i]); // convert string into integer
            int num2 = Integer.parseInt(arr2[i]);
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
            i++;
        } // all numbers are the same so far

        // if version1 has more numbers, it is greater
        if (i < arr1.length) {
            return 1;
        } else if (i < arr2.length) { // if version2 has more numbers, it is greater
            return -1;
        }
        return 0; // i = arr1.length = arr2.length  ->  version1 = version2
    }

    public static void main(String[] args) {
        String version1 = "1.2";
        String version2 = "1.2.9.9.9.9";
        int result = compareVersions(version1, version2);
        System.out.println(result); // print -1
    }
}

