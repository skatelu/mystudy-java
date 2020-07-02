package juc.single;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.bouncycastle.asn1.DERNull;

/**
 * enum 是一个什么？ 本身也是一个class类
 */
public class EnumSingle {

    private EnumSingle() {

    }

    public enum SingLeton{
        INSTANCE;
        private final EnumSingle instance;

        SingLeton(){
            instance = new EnumSingle();
        }

        private EnumSingle getInstance(){
            return instance;
        }
    }

    public static EnumSingle getInstance(){
        return SingLeton.INSTANCE.getInstance();
    }
}
