package com.aliyou.FrancaisIntoJavanais;

public class FrancaisIntoJavanais {
	private char car;
	private String word;

	public boolean isVowel(char c) {
		this.car = c;
		String vowels = "aeiouy";

		if (vowels.indexOf(this.car) != -1 || vowels.toUpperCase().indexOf(this.car) != -1) {
			return true;
		}
		return false;
	}

	public boolean isConsonant(char c) {
		this.car = c;
		String consonants = "bcdfghjklmnpqrstvwxz";

		if (consonants.indexOf(this.car) != -1 || consonants.toUpperCase().indexOf(this.car) != -1) {
			return true;
		}
		return false;
	}

	public String francaisIntoJavanais(String word) {
		this.word = word;
		String francaisIntoJavanais = "";		
		int i = 0;
		while (i < this.word.length()) {
			try{
				// Traitement du premier caractère du mot
				if (i==0 && isVowel(this.word.charAt(0))) {
					francaisIntoJavanais = "av" + this.word.charAt(0);
				}
	
				// Traitement du caractère s'il n'est ni le premier ni le dernier dans le mot
				else if (isConsonant(this.word.charAt(i)) && isVowel(this.word.charAt(i + 1)) && (i != this.word.length() - 1)) {
					francaisIntoJavanais += this.word.charAt(i) + "av";
				}
				// Sinon...
				else {
					francaisIntoJavanais += this.word.charAt(i);
				}
			}
			catch(StringIndexOutOfBoundsException e){}
			i++;
		}
		return francaisIntoJavanais;
	}
}
