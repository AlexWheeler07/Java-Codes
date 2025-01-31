class CallByValueReference {
    // Call by value
    void modifyValue(int a) {
        a = a + 10;
        System.out.println("Inside modifyValue: " + a);
    }
    // Call by reference
    void modifyReference(int[] arr) {
        arr[0] = arr[0] + 10;
        System.out.println("Inside modifyReference: " + arr[0]);
    }
    public static void main(String[] args) {
        CallByValueReference obj = new CallByValueReference();
        // Call by value
        int num = 5;
        System.out.println("Before modifyValue: " + num);
        obj.modifyValue(num);
        System.out.println("After modifyValue: " + num);
        // Call by reference
        int[] array = {5};
        System.out.println("Before modifyReference: " + array[0]);
        obj.modifyReference(array);
        System.out.println("After modifyReference: " + array[0]);
    }
}
