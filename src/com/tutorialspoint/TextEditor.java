package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor constructor.");
	}
	/*
	 * 基于构造函数的DI
	 */
//	public TextEditor(SpellChecker spellChecker) {
//		// TODO Auto-generated constructor stub
//		System.out.println("Inside TextEditor constructor.");
//		this.spellChecker = spellChecker;
//	}
	
	/*
	 * 基于设值函数的DI
	 */
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
