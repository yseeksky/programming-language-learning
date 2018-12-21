public class Puppy {
    public Puppy(String name,int age){
//        本地变量在方法、构造器或者块中声明,age2 是本地变量。需要初始化，如果不进行初始化，会报错。
        int age2;
        age2=0;
        age2=age+7;


        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name + "     age:"+ age2);
    }
    public static void main(String []args){
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy", 18 );
//        如果传入了参数，是直接调用构造器的方法
    }
}
