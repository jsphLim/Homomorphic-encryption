import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class Tools {
	public static BigInteger getSecPrime(int bits) {
		// TODO Auto-generated method stub
		SecureRandom srd = new SecureRandom();
		BigInteger p, q;

		q = BigInteger.probablePrime(bits - 1, srd);
		p = q.add(q).add(BigInteger.ONE);

		while (!p.isProbablePrime(Integer.MAX_VALUE)) {
			do {
				q = q.nextProbablePrime();
			} while (q.mod(BigInteger.TEN).equals(BigInteger.valueOf(7))
					|| !q.mod(BigInteger.valueOf(4)).equals(
							BigInteger.valueOf(3)));

			p = q.add(q).add(BigInteger.ONE);

			while (p.bitLength() != bits) {
				q = BigInteger.probablePrime(bits - 1, srd);
				p = q.add(q).add(BigInteger.ONE);
			}
		}
		return p;
	}


    public static BigInteger getRandomBigInteger(BigInteger nSquare) {
        SecureRandom random = new SecureRandom();

        byte[] rbyte = new byte[nSquare.bitLength()];
        random.nextBytes(rbyte);

        return new BigInteger(rbyte).mod(nSquare);

    }

	public static BigInteger eular(BigInteger p,BigInteger q) {
		return (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
	}

	
}
