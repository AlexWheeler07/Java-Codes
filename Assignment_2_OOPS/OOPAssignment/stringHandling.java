/*Write Java codes to implement basic string handling concepts - mutable and immutable strings, and methods of String class. */

    public class stringHandling {
        public static void main(String[] args) {
            // Immutable String (String class)
            String str1 = "Hello";
            String str2 = str1.concat(" World");
            System.out.println("Immutable String:");
            System.out.println("Original String: " + str1);
            System.out.println("After Concatenation: " + str2);
    
            // Mutable String (StringBuilder)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");
            System.out.println("\nMutable String using StringBuilder:");
            System.out.println("After Append: " + sb);
            
            // Mutable String (StringBuffer - Thread Safe)
            StringBuffer sf = new StringBuffer("Hello");
            sf.append(" World");
            System.out.println("\nMutable String using StringBuffer:");
            System.out.println("After Append: " + sf);
    
            // Methods of String class
            String sample = " Java Programming ";
            System.out.println("\nMethods of String Class:");
            System.out.println("Original String: '" + sample + "'");
            System.out.println("Length: " + sample.length());
            System.out.println("Trimmed: '" + sample.trim() + "'");
            System.out.println("Upper Case: " + sample.toUpperCase());
            System.out.println("Lower Case: " + sample.toLowerCase());
            System.out.println("Substring (5, 16): " + sample.substring(5, 16));
            System.out.println("Replace 'a' with '*': " + sample.replace('a', '*'));
            System.out.println("Character at index 3: " + sample.charAt(3));
            System.out.println("Index of 'Pro': " + sample.indexOf("Pro"));
            System.out.println("Contains 'Java': " + sample.contains("Java"));
        }
    }

