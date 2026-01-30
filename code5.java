class code5 {
    public static int add(int x ,int y){
        System.out.println(x+y);
        return x+y;
    }
    public static int add(int x,int y,int z){
        System.out.println(x+y+z);
        return x+y+z;
    }
    public static void main(String[] args) {
        add(10,20);
        add(10,20,30);
    }
}
    