public class Puppy {
    public Puppy(String name,int age){
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name + "     age:"+ age);
    }
    public static void main(String []args){
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy", 18 );
//        如果传入了参数，是直接调用构造器的方法
    }
}
