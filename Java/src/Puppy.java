public class Puppy {
    public Puppy(String name,int age){
//        本地变量在方法、构造器或者块中声明,age2 是本地变量。需要初始化，如果不进行初始化，会报错。
        int age2;
        age2=0;
        age2=age+7;


        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name + "     age:"+ age2);
    }

//    数组可以作为参数传递给方法。
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    static {
        System.out.println("");
    }



//    数组作为一个函数的返回值
    public static int[] reverse(int[] list) {
        int a = 3;

        System.out.println(a);

        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }



    public static void main(String []args){
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy", 18 );
//        如果传入了参数，是直接调用构造器的方法


        reverse(new int[]{});

        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);






//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // 打印所有数组元素
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//        // 计算所有元素的总和
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Total is " + total);
//        // 查找最大元素
//        double max = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) max = myList[i];
//        }
//        System.out.println("Max is " + max);






        //   JDK 1.5 引进了一种新的循环类型，被称为 foreach 循环或者加强型循环，它能在不使用下标的情况下遍历数组。
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // 打印所有数组元素
//        for (double element: myList) {
//            System.out.println(element);
//        }


//        给方法中传入数组
        printArray(new int[]{3, 1, 2, 6, 4, 2});




    }
}
