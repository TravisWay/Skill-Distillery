package com.skilldistillery.history;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;

public class PresidentAppLambda {
	private static final String fileName = "presidents.tsv";
	private List<President> presidents = new ArrayList<>();

	public static void main(String[] args) {
		PresidentAppLambda app = new PresidentAppLambda();
		app.start();
		
		
	}

	public void start() {
		
		
		this.printPresidents(this.filter2("Democrat", new BiPredicate<President, String>(){@Override
		public boolean test(President t, String u) {
			// TODO Auto-generated method stub
			return false;
		} 
		}));
		this.printPresidents(this.getPresidents());
		
		List<President> sorted = new ArrayList<>();
		sorted.addAll(presidents);
		Comparator<President>test = (o1, o2)->o1.getLastName().compareTo(o2.getLastName());
		Collections.sort(sorted,test);
			
			
//		else{
//			if(o1.getTermNumber()>o2.getTermNumber()){
//				return -1;
//				
//			}
//			else if(o1.getTermNumber()<o2.getTermNumber()){
//				return 1;
//				
//			}
//			else{
//				return 0;
//			}
//		}
		
		
	
//		for (President p : sorted) {
//			System.out.println(p);
//		}
	
	
	// SortedByPartyAndTerm();
	// class PC implements Comparator<President>{
	//
	// @Override
	// public int compare(President o1, President o2) {
	// // TODO Auto-generated method stub
	// if(o1.getWhyLeftOffice().hashCode()>o2.getWhyLeftOffice().hashCode()){
	// return -1;
	//
	// }
	// else
	// if(o1.getWhyLeftOffice().hashCode()<o2.getWhyLeftOffice().hashCode()){
	// return 1;
	//
	// }
	// else{
	// if(o1.getTermNumber()>o2.getTermNumber()){
	// return -1;
	//
	// }
	// else if(o1.getTermNumber()<o2.getTermNumber()){
	// return 1;
	//
	// }
	// else{
	// return 0;
	// }
	// }
	//
	//
	// }

//	List<President> sorted = new ArrayList<>();sorted.addAll(presidents);
//	PC test = new PC();Collections.sort(sorted,test);
//
	printPresidents(sorted);
//		
}	


	 public PresidentAppLambda() { 
		this.loadPresidents(fileName);
	}

	class PC implements Comparator<President> {

		@Override
		public int compare(President o1, President o2) {
			// TODO Auto-generated method stub
			if (o1.getParty().hashCode() > o2.getParty().hashCode()) {
				return -1;

			} else if (o1.getParty().hashCode() < o2.getParty().hashCode()) {
				return 1;

			} else {
				if (o1.getTermNumber() > o2.getTermNumber()) {
					return -1;

				} else if (o1.getTermNumber() < o2.getTermNumber()) {
					return 1;

				} else {
					return 0;
				}
			}

		}
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
	public List<President> filter2(String s, BiPredicate<President,String> mine) {
		List<President> filtered = new ArrayList<>();
		for (President p : presidents) {
			if (mine.test(p, s)) {
				filtered.add(p);
			}
		}
		return filtered;
	}

	public void SortedByPartyAndTerm() {
		List<President> sorted = new ArrayList<>();
		sorted.addAll(presidents);
		PC test = new PC();
		Collections.sort(sorted, (o1,o2)->{return o1.getLastName().compareTo(o2.getLastName());});
		 printPresidents(sorted);

	}

	private void loadPresidents(String fileName) {
		// File format (tab-separated):
		// # First Middle Last Inaugurated Left office Elections won Reason left
		// office Party
		// 1 George Washington July 1, 1789 March 4, 1797 2 Did not seek
		// re-election Independent
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String record = reader.readLine(); // Read and discard header line
			while ((record = reader.readLine()) != null) {
				String[] col = record.split("\\t");
				LocalDate eterm;
				int term = Integer.parseInt(col[0]);
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
				LocalDate bterm = LocalDate.parse(col[4], formatter); // Date
																		// term
																		// began.
				try {
					LocalDate.parse(col[5], formatter);
					eterm = LocalDate.parse(col[5], formatter);
				} catch (DateTimeParseException mine) {
					eterm = null;
					// TODO: handle exception
				} // Date term ended.

				int won = Integer.parseInt(col[6]);
				String whyLeft = col[7];
				String party = col[8];

				President pres = new President(term, fName, mName, lName, bterm, eterm, won, whyLeft, party);
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
