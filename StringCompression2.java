public class StringCompression2 {

    public static void compressString(char[] chars) {
        int writeIndex = 0; // Pointer to write compressed characters
        int readIndex = 0; // Pointer to read characters

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            // Count consecutive occurrences of the current character
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            chars[writeIndex++] = currentChar; // Write the character

            // If count is greater than 1, write its digits as characters
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[writeIndex++] = c;
                }
            }
        }

        return writeIndex; // Return the new length of the modified array

    }

    public static void main(String[] args) {
        char[] chars = { 'a', 's', 'a', 'x', 't', 'y' };
        
    }

}
