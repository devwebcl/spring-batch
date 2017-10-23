package cl.devweb.security.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;

import org.springframework.jdbc.datasource.SingleConnectionDataSource;


public class EncryptDataSource extends SingleConnectionDataSource {

	@SuppressWarnings("restriction")
	private static sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
	@SuppressWarnings("restriction")
	private static sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();
	private Cipher encrypter, decrypter;
	// Pi XD
	private static byte[] salt = { (byte) 0x03, 0x01, 0x04, 0x01, 0x05, 0x09, 0x02, 0x06}; 
	
	
	public EncryptDataSource() throws Exception {
		
		Properties p = new Properties();
		
		String password = "";

		//migration.properties must have custom property: password 
		//and database.xml with encrypted values
		try (InputStream in = this.getClass().getClassLoader().getResourceAsStream("migration.properties")) {
			p.load(in);
			//load master password from external file:
			password = p.getProperty("password");
		} catch (IOException e) {
			logger.error(e);
			throw e;
		}


		PBEParameterSpec ps = new javax.crypto.spec.PBEParameterSpec(salt, 20);
		SecretKeyFactory kf = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
		SecretKey k = kf.generateSecret(new javax.crypto.spec.PBEKeySpec(password.toCharArray()));
		encrypter = Cipher.getInstance("PBEWithMD5AndDES/CBC/PKCS5Padding");
		decrypter = Cipher.getInstance("PBEWithMD5AndDES/CBC/PKCS5Padding");
		encrypter.init(Cipher.ENCRYPT_MODE, k, ps);
		decrypter.init(Cipher.DECRYPT_MODE, k, ps);
	}
	

	@SuppressWarnings("restriction")
	private  String decrypt(String str)  {
			
		byte[] dec;
		byte[] utf8;
		String result = null;
		
		try {

			dec = decoder.decodeBuffer(str);
			utf8 = decrypter.doFinal(dec);
			result = new String(utf8, "UTF-8");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	

	@SuppressWarnings("restriction")
	private  String encrypt(String str) throws Exception {
		byte[] utf8 = str.getBytes("UTF-8");
		byte[] enc = encrypter.doFinal(utf8);
		return encoder.encode(enc);
	}
	
	
	//Spring attribute mandatory:
	@Override
	public String getPassword() {
		String password = super.getPassword();
		return decrypt(password);
	}
	
	
	public static void main(String args[]) throws Exception {
		
		EncryptDataSource eds = new EncryptDataSource();
			
		//here we are generating encrypted passwords depending on master password (@constructor).
		//output should be written at database.xml

		//test:
		String decrypted = "hr";
		System.out.println("decrypted==" + decrypted);
		System.out.println("encrypted==" + eds.encrypt(decrypted) + "\n");

		//test:
		decrypted = "welcome1";
		System.out.println("decrypted==" + decrypted);
		System.out.println("encrypted==" + eds.encrypt(decrypted) + "\n");

	}

	
}

