import java.math.BigInteger;
public class cipherText {

    private BigInteger cipherText;

    public cipherText(BigInteger enc){
        this.cipherText = enc;
    }

    public BigInteger getCipherText() {
        return cipherText;
    }
}
