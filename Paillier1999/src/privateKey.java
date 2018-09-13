import java.math.BigInteger;

public class privateKey {
    private BigInteger N;
    private BigInteger eular_N;

    public privateKey(BigInteger n,BigInteger e){
        this.N=n;
        this.eular_N=e;
    }

    public BigInteger getN() {
        return N;
    }

    public void setN(BigInteger n) {
        N = n;
    }

    public BigInteger getEular_N() {
        return eular_N;
    }

    public void setEular_N(BigInteger eular_N) {
        this.eular_N = eular_N;
    }
}
