package org.devatom.cryptencrypt;

public class Decrypteur {
	/**
	 * Méthode permettant de décrypter une chaine en utilisant le codage de César
	 * @param strToDecrypt
	 * @return Chaine décryptée
	 */
	public static String decrypt(String strToDecrypt){
		String retVal = "";
		for (int i = 0; i < strToDecrypt.length(); i++){
			int idx = CryptEncrypt.liste2.find(strToDecrypt.charAt(i));
			retVal += CryptEncrypt.liste1.get(idx).getData();
		}
		return retVal;
	}
}
