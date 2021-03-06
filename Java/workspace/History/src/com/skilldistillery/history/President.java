package com.skilldistillery.history;

import java.time.LocalDate;
import java.time.Period;


public class President implements Comparable<President> {
	
	
	private int termNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int electionsWon;
	private String whyLeftOffice;
	private String party;
	private LocalDate bterm;
	private LocalDate eterm;
	private Period length;
	
	
	public President(int termNumber, String firstName, String middleName, String lastName, LocalDate bterm, LocalDate eterm,int electionsWon,
			String reasonLeftOffice, String party) {
		super();
		
		this.termNumber = termNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.electionsWon = electionsWon;
		this.whyLeftOffice = reasonLeftOffice;
		this.party = party;
		this.bterm = bterm;
		this.eterm = eterm;
		setLength();
		
		
		
	}

	public LocalDate getBterm() {
		return bterm;
	}

	public void setBterm(LocalDate bterm) {
		this.bterm = bterm;
	}

	public LocalDate getEterm() {
		return eterm;
	}

	public void setEterm(LocalDate eterm) {
		this.eterm = eterm;
	}

	public int getTermNumber() {
		return termNumber;
	}

	public void setTermNumber(int termNumber) {
		this.termNumber = termNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getElectionsWon() {
		return electionsWon;
	}

	public void setElectionsWon(int electionsWon) {
		this.electionsWon = electionsWon;
	}

	public String getWhyLeftOffice() {
		return whyLeftOffice;
	}

	public void setWhyLeftOffice(String reasonLeftOffice) {
		this.whyLeftOffice = reasonLeftOffice;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}
	public void setLength(){
		if(eterm != null){
		this.length =Period.between(bterm,eterm);
		}
		else{
		this.length = Period.between(bterm, LocalDate.now());
		}
		
	}
	public Period getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(termNumber + ": ");
		builder.append(firstName + " ");
		if (middleName.length() > 0) {
			builder.append(middleName + " ");
		}
		builder.append(lastName);
		builder.append(" (" + party + ")");
		builder.append(", electionsWon=");
		builder.append(electionsWon);
		builder.append(", whyLeftOffice=");
		builder.append(whyLeftOffice);
		builder.append(", Term start=");
		builder.append(bterm);
		builder.append(", Term end=");
		builder.append(eterm);
		builder.append(", Term length=");
		builder.append(length);
		
		
		
		
		return builder.toString();
	}

	@Override
	public int compareTo(President other) {
		if (this.termNumber > other.termNumber) {
			return 1;
		} else if (this.termNumber < other.termNumber) {
			return -1;
		}
		return 0;
	}

}

