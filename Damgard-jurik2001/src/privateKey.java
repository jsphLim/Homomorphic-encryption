import java.math.BigInteger;

public class privateKey {
    private BigInteger U; //eular(n)^-1 mod n
    private BigInteger eular_N;

    public privateKey(BigInteger n,BigInteger u,BigInteger e){
        this.U=u;
        this.eular_N=e;
    }

    public BigInteger getU() {
        return U;
    }


    public BigInteger getEular_N() {
        return eular_N;
    }



}
