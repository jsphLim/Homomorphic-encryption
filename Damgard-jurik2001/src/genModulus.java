import java.math.BigInteger;


public class genModulus {

    public static keyPair Gen(int bits){
        BigInteger p = Tools.getSecPrime(bits);
        BigInteger q = Tools.getSecPrime(bits);
        return new keyPair(new publicKey(p.multiply(q)),new privateKey(p.multiply(q),Tools.eular(p,q).modInverse(p.multiply(q)),Tools.eular(p,q)));
    }

    public static BigInteger Encode(keyPair keypair,BigInteger m){
        publicKey key = keypair.getPublickey();
        BigInteger nsquare = key.getN().pow(Main.S);
        BigInteger r= Tools.getRandomBigInteger(nsquare);
        return (key.getN().add(BigInteger.ONE)).modPow(m,nsquare.multiply(key.getN())).multiply(r.modPow(nsquare, nsquare.multiply(key.getN()))).mod(nsquare.multiply(key.getN()));
    }

    public static BigInteger Decode(keyPair keypair,BigInteger cipherText){
        privateKey key = keypair.getPrivatekey();
        BigInteger N = keypair.getPublickey().getN();
        BigInteger tmp = cipherText.modPow(key.getEular_N(),N.multiply(N));
        tmp = (tmp.subtract(BigInteger.ONE).divide(N)).multiply(key.getU()).mod(N);
        return tmp.mod(N.pow(2));
    }




}
