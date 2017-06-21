package caesar;

import java.util.Map;
import java.util.concurrent.Callable;

public class CaesarCipher implements Callable<String> {
	private int shift;
	private String msg;
	private CaesarCipherDecrypter decrypter;
	private Map<Integer, String> outputmap;

	public CaesarCipher(int shift, String msg, Map<Integer, String> m) {
		super();
		this.shift = shift;
		this.msg = msg;
		decrypter= new CaesarCipherDecrypter(msg, shift);
		this.outputmap= m;
	}

	@Override
	public String call() throws Exception {
		String done = decrypter.decryptText(msg);
		outputmap.put(shift, done);
		return done;
	}


	
}
