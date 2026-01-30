class code6 {
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers: " + sum);
    }
    public static void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three numbers: " + sum);
    }
    public static void main(String[] args) {
        add(10, 20);      
        add(10, 20, 30);  
    }
}