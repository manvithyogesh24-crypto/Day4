class person
{
    private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
class code12{
    public static void main(String[]args){
        person P1 = new person();
        P1.setName("Alice");
        P1.setAge(20);
        System.out.println(P1.getName());
         System.out.println(P1.getAge());
    }
    }
   