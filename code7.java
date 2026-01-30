class code7{
    public static double add(double x,double y){
        return x+y;
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        double res =add(10,20);
        int res1=add(40,20);
        System.out.println(res);
        System.out.println(res1);
    }
}