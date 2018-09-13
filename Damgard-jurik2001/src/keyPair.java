public class keyPair {

    private publicKey publickey;
    private  privateKey privatekey;

    public keyPair(publicKey publickey,privateKey privatekey){
        this.publickey=publickey;
        this.privatekey=privatekey;
    }

    public publicKey getPublickey() {
        return publickey;
    }

    public privateKey getPrivatekey() {
        return privatekey;
    }

}
