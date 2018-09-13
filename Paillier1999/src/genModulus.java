import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PublicKey;

public class genModulus {

    public static keyPair Gen(int bits){
        BigInteger p = Tools.getSecPrime(bits);
        BigInteger q = Tools.getSecPrime(bits);
        return new keyPair(new publicKey(p.multiply(q)),new privateKey(p.multiply(q),Tools.eular(p,q)));
    }

    public static BigInteger Encode(publicKey key,BigInteger m){
        BigInteger nsquare = key.getN().multiply(key.getN());
        BigInteger r= Tools.getRandomBigInteger(nsquare);
        return (key.getN().add(BigInteger.ONE)).modPow(m,nsquare).multiply(r.modPow(key.getN(), nsquare)).mod(nsquare);
    }

    public static BigInteger Decode(privateKey key,BigInteger cipherText){
        BigInteger nsquare = key.getN().multiply(key.getN());
        BigInteger tmp = cipherText.modPow(key.getEular_N(),nsquare);
        tmp = (tmp.subtract(BigInteger.ONE).divide(key.getN())).multiply(key.getEular_N().modInverse(key.getN()));
        return tmp.mod(key.getN());
    }




}
