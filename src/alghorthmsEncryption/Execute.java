package alghorthmsEncryption;

public class Execute {

	public static void main(String[] args) {

		final String SECRETKEY = "EmilianoKalujerovich";
		String planeText = "ThisIsmyKey";

		try {

			CryptoUtils crypto = new CryptoUtils();

			String encrypt = crypto.encrypt(SECRETKEY, planeText);
			String decrypt = crypto.decrypt(SECRETKEY, encrypt);
			System.out.println(encrypt);
			System.out.println(decrypt);
			
		} catch (Exception e) {
		}
	}

}
