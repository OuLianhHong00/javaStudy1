//实现Talking接口，并且实现其方法
public class Animation implements Talking{
    private String name;
    private int age;
    public void setAge(int age) {
        this.age = age;
    }


    public Animation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public  void say(){
        System.out.println("Hello "+getName());
    }

    public void talk(){
        System.out.println("这是我的独白");
    }


}
