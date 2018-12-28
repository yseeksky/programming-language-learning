public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//         Java 是一种大小写敏感的语言，这就意味着 Hello 和 hello 在 Java 中代表不同的意思。
//      类的命名：  所有类的名称首字母必须大写。如果类名称中包含几个单词，那么每个单词的首字母都要大写。例如类 MyFirstJavaClass
//        方法的命名：所有方法名称必须以小写字母开头。如果方法名称中包含几个单词，那么其中的每个单词的首字母都要大写。例如 public void myMethodName()
//        算术运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

//        自增运算
         b=++a;
        System.out.println("b=" +b);

        c=--b;
        System.out.println("c=" +c);

//        前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
//        后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算
        a=5;
        b=5;
        int x = 2*++a;
        int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);


//        关系运算符
        a=10;
        b=20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

//        位运算符，转换成二进制进行运算

        a = 60; /* 60 = 0011 1100 */
        b = 13; /* 13 = 0000 1101 */
        c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );


//        逻辑运算符
        boolean i = true;
        boolean k = false;
        System.out.println("i && k = " + (i && k));
        System.out.println("i || k = " + (i || k));
        System.out.println("!(i && k) = " + !(i && k));

//        while 循环
        int p =10;
        while (p<20)
        {
            System.out.println("p = " + p);
            p++;

        }

        /*

        对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
        do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

        do {
       //代码语句
            }while(布尔表达式);
        * */

        x = 10;

        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        System.out.println("\n100<100");

//        for 循环
        for (x = 10;x < 20; x++)
        {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }


//        break 语句
        int [] numbers = {10, 20, 30, 40, 50};

        for(int v : numbers ) {
            // v 等于 30 时跳出循环
            if( v == 30 ) {
                break;
            }
            System.out.print( v );
            System.out.print("\n");
        }

//        continue 语句，当条件==30时，这句不运算，跳过。
        for(int h : numbers ) {
            if( h == 30 ) {
                continue;
            }
            System.out.print( h );
            System.out.print("\n");
        }

//        if 条件语句
        x = 10;

        if( x < 20 ){
            System.out.print("这是 if 语句");
        }

        if( x < 20 ){
            System.out.print("\n这是 if 语句");
        }else{
            System.out.print("这是 else 语句");
        }

//        嵌套的 if…else语句
        x=30;
        y=10;
        if( x == 30 ){
            if( y == 10 ){
                System.out.print("\nX = 30 and Y = 10");
            }
        }

        /*switch case 语句
        switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号
        case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量
        当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
         */

        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("\n良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);


        x = 5;
        x =  x + 10;
        System.out.println(x);

    }


}


