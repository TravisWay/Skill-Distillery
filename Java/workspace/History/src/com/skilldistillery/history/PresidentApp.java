package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class PresidentApp {
	private static final String fileName = "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentApp app = new PresidentApp();
		app.start();
	}
	
	public void start() {
		this.printPresidents(this.getPresidents());
		
		
	}

	public PresidentApp() {
		this.loadPresidents(fileName);
	}
	
	public List<President> getPresidents() {
		return this.presidents;
	}

	public void printPresidents(List<President> pres) {
		for (President p : pres) {
			System.out.println(p);
		}
	}

	public List<President> filter(String string, PresidentMatcher matcher) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (matcher.matches(p, string)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		//#	First	Middle	Last	Inaugurated	Left office	Elections won	Reason left office	Party
		//1	George		Washington	July 1, 1789	March 4, 1797	2	Did not seek re-election	Independent
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");
				LocalDate eterm;
				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				DateTimeFormatter formatter =
						DateTimeFormatter.ofPattern("MMMM d, yyyy");
				LocalDate bterm =LocalDate.parse(col[4], formatter); //Date term began.
				try {LocalDate.parse(col[5], formatter);
					eterm = LocalDate.parse(col[5], formatter);
				} catch (DateTimeParseException mine) {
					eterm = null;
					// TODO: handle exception
				} //Date term ended.
			
				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, bterm, eterm, won, whyLeft,party);
				presidents.add(pres);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(1);
		}
	}

	private LocalDate formatter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}