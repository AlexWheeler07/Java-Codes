class ParameterizedConstructor {
    int x;
    ParameterizedConstructor(int value) {
        x = value;
        System.out.println("Parameterized constructor called. Value: " + x);
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
    }
}
