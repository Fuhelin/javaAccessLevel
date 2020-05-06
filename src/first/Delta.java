package first;

public class Delta extends Alpha {
    public void assessMethod(Alpha alpha,Delta delta){
        //1.private       ---->不能访问
        /*System.out.println(alpha.iamprivate);
        alpha.privateMethod();*/
        //2.default       ---->可以访问
        System.out.println(alpha.iamdefault);
        alpha.defaultMethod();
        //3.protected     ---->可以访问
        System.out.println(alpha.iamprotected);
        alpha.protectedMethod();
        //4.public        ---->可以访问
        System.out.println(alpha.iampublic);
        alpha.publicMethod();

        //1.private        ---->不能访问
        /*System.out.println(delta.iamprivate);       //父类的private成员和方法不能子类被继承
        delta.privateMethod();*/
        //2.default        ---->可以访问
        System.out.println(delta.iamdefault);
        delta.defaultMethod();
        //3.protected      ---->可以访问
        System.out.println(delta.iamprotected);
        delta.protectedMethod();
        //4.public          ---->可以访问
        System.out.println(delta.iampublic);
        delta.publicMethod();

        /*
            java访问权限:
            类的访问权限
            最外部类的访问权限仅有两种：public >  default(不写)
                1.public对应于任意包，即在任意包下都能创建该类的对象、调用该类的静态成员和方法使用该类
                2.default(不写)对应于同一个包，即在同一个包下才能创建default权限类的对象、调用该类的静态成员和方法使用该类
            成员内部类：public > protected > default(不写) > private
                成员内部类的访问权限和成员变量、方法的访问权限一样
            局部内部类：
                同局部变量一样，由于其作用域是所在的方法或代码块。外部程序单元不可能访问局部变量内容，因此谈不上访问权限。

             类的成员变量、方法的访问权限：public > protected > default(不写) > private
                1.同一个类中，任意访问
                2.同一个包中（子类、非子类），可以访问所有非private的成员
                3.不同包的子类，可以访问public、protecetd的成员
                4.不同包非子类，只能访问public的成员。

                                         public      protected     default(不写)       private
                同一个类                     √           √             √                √
                同一个包（子类、非子类）      √           √              √                ×
                不同的包子类                 √           √              ×                ×
                不同的包非子类               √           ×              ×                ×

                注意：当两个类在同一个.java文件中时，认为两个类在同一个包下（如Alpha和Beta）
         */


    }
}
