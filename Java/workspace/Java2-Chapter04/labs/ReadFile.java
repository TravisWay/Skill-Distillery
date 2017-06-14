package labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {

		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader(args[0]));

			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] readArr = line.split(", ");
				List<String> data = new ArrayList<String>();

			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}
}
