package org.devatom.cryptencrypt;

public class Crypteur {
	/**
	 * Méthode permettant d'encrypter une chaine en utilisant le codage de César
	 * @param strToEncrypt
	 * @return Chaine encryptée
	 */
	public static String encrypt(String strToEncrypt){
		String retVal = "";
		for (int i = 0; i < strToEncrypt.length(); i++){
			int idx = CryptEncrypt.liste1.find(strToEncrypt.charAt(i));
			retVal += CryptEncrypt.liste2.get(idx).getData();
		}
		
		return retVal;
	}
}
