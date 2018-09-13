import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int bits=100; //bits长度

        //KeyPair
        keyPair keypair = genModulus.Gen(bits);

        BigInteger m = new BigInteger("332422345"); //测试
        cipherText c = new cipherText(genModulus.Encode(keypair.getPublickey(),m));
        System.out.println("encode result:"+c.getCipherText());

        BigInteger decode_res = genModulus.Decode(keypair.getPrivatekey(),c.getCipherText());
        System.out.println("decode result:"+decode_res);

    }

}
