package helloworld;

import org.apache.commons.codec.binary.Base64;

public class Password_Encyption {

	public static void main(String[] args) {
		//String orig="Original String before base64";
		String orig="ratnanjali";
		//encoding byte array in base64
		byte[] encoded=Base64.encodeBase64(orig.getBytes());
		System.out.println("original string " +orig);
		System.out.println("base64 encoded strng: "+new String(encoded));

	}

}
