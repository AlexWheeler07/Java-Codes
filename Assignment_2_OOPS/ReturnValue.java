class ReturnValue {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        ReturnValue obj = new ReturnValue();
        int result = obj.add(10, 20);
        System.out.println("The sum is: " + result);
    }
}
