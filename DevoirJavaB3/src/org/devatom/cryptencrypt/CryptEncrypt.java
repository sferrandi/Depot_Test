package org.devatom.cryptencrypt;

public class CryptEncrypt {
	/**
	 * liste1 est la liste des caractères sans décallage
	 * liste2 est la liste des caractères avec décallage
	 * CAESARNUMBER est le décallage entre liste1 et liste2
	 */
	public static Liste liste1, liste2;
	public static final int CAESARNUMBER = 13;
	public static void main(String[] args) {
		liste1 = new Liste();
		liste1.populate();
		liste2 = new Liste(liste1, CAESARNUMBER);

		System.out.println(liste1);
		System.out.println(liste2);
		
		System.out.println("----------");
		String strToEncrypt = "AMMIvVVIN1EB3_57O:MHF_G7MV2xd:O:V3EN1FNLB3:E_SBI";
		System.out.println(strToEncrypt);
		String strEncrypted = Crypteur.encrypt(strToEncrypt);
		System.out.println(strEncrypted);
		System.out.println("----------");
		
		String strToDecrypt =strToEncrypt;
		System.out.println(strToDecrypt);
		String strDecrypted = Decrypteur.decrypt(strToDecrypt);
		System.out.println(strDecrypted);

	}
}
