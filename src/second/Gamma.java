package second;

//在不同的包，需要导包
import first.Alpha;

public class Gamma {
    public void accessMethod(){
        //创建Alpha的实例化对象
        Alpha alpha = new Alpha();
        //1.private         ---->不能访问
        /*System.out.println(alpha.iamprivate);
        alpha.privateMethod();
        //2.default         ---->不能访问
        System.out.println(alpha.iamdefault);
        alpha.defaultMethod();
        //3.protected       ---->不能访问
        System.out.println(alpha.iamprotected);
        alpha.protectedMethod();*/
        //4.public          ---->不能访问
        System.out.println(alpha.iampublic);
        alpha.publicMethod();
    }
}
