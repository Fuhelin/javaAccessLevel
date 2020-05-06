package second;

import first.Alpha;

public class Delta extends Alpha {
    public void assessMethod(Alpha alpha,Delta delta){
        //1.private       ---->不能访问
        /*System.out.println(alpha.iamprivate);
        alpha.privateMethod();
        //2.default       ---->不能访问
        System.out.println(alpha.iamdefault);
        alpha.defaultMethod();
        //3.protected     ---->不能访问
        System.out.println(alpha.iamprotected);
        alpha.protectedMethod();*/
        //4.public        ---->可以访问
        System.out.println(alpha.iampublic);
        alpha.publicMethod();

        //1.private        ---->不能访问
        /*System.out.println(delta.iamprivate);       //父类的private成员和方法不能子类被继承，顾不能访问。
        delta.privateMethod();
        //2.default        ---->不能访问
        System.out.println(delta.iamdefault);       //子类与父类位于不同包下时，不能访问父类默认权限成员
        delta.defaultMethod();*/
        //3.protected      ---->可以访问
        System.out.println(delta.iamprotected);
        delta.protectedMethod();
        //4.public          ---->可以访问
        System.out.println(delta.iampublic);
        delta.publicMethod();
    }
}
