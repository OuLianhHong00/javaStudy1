/*
People类继承Animation类，可以继承他的属性，也可以重写它的方法
 */
public class People extends Animation {
    private  String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public People(String name, int age,String job) {
        super(name, age);
        this.job=job;
    }
    //重写say方法
    public  void say(){
        System.out.println("Hello"+getName()+","+"你的工作是："+getJob());
    }

}
