package first;

public class Alpha {
    private int iamprivate;
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    int iamdefault;
    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    protected int iamprotected;
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    public int iampublic;
    public void publicMethod(){
        System.out.println("publicMethod");
    }
}
//一个.java文件中只能有一个public类，并且该public类的类名应与java文件名相同，故这里Beta类不能是public,只能是默认权限修饰
class Beta{
    public static void accessMethod(){
        //创建Alaph的实例对象
        Alpha alpha = new Alpha();
        //1.private属性        ---->不能访问
        /*System.out.println(alpha.iamprivate);
        alpha.privateMethod();*/
        //2.default属性        ---->可以访问
        System.out.println(alpha.iamdefault);
        alpha.defaultMethod();
        //3.protected属性      ---->可以访问
        System.out.println(alpha.iamprotected);
        alpha.protectedMethod();
        //4.public属性         ---->可以访问
        System.out.println(alpha.iampublic);
        alpha.publicMethod();
    }
}