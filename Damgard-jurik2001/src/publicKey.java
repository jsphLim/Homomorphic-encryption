import java.math.BigInteger;

public class publicKey {
    private BigInteger N;
    public publicKey(BigInteger N){
        this.N = N;
    }
    public BigInteger getN() {
        return N;
    }

}
