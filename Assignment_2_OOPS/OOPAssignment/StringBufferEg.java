public class StringBufferEg {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + sb);

        // append() - Adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert() - Inserts text at specified index
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // replace() - Replaces part of the string
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // delete() - Deletes a portion of the string
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // reverse() - Reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // capacity() - Returns the capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());
    }
}