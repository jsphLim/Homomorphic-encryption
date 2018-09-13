import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static int S = 10; // S

    public static void main(String[] args) {
        int bits=100; //bits长度
        //KeyPair
        keyPair keypair = genModulus.Gen(bits);

        BigInteger m = new BigInteger("921561741452"); //测试
        cipherText c = new cipherText(genModulus.Encode(keypair,m));
        System.out.println("encode result:"+c.getCipherText());

        BigInteger decode_res = genModulus.Decode(keypair,c.getCipherText());
        System.out.println("decode result:"+decode_res);

    }

}
