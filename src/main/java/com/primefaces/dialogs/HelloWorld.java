package com.primefaces.dialogs;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class HelloWorld {

	private String name = "John";
	private String type = "Doe";
	
	private String oldName = "John";
	private String oldType = "Doe";

	private Boolean showTypeDialog = false;
	private Boolean showOtherDialog = false;
	private Boolean submitForm = false;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName1() {
		return oldName;
	}

	public void setName1(String name1) {
		this.oldName = name1;
	}

	public String getType1() {
		return oldType;
	}

	public void setType1(String type1) {
		this.oldType = type1;
	}

	public String showNameType() {
		return "Hello " + name + " " + type + "!";
	}
	
	public Boolean getSubmitForm() {
		return submitForm;
	}

	public void setSubmitForm(Boolean submitForm) {
		this.submitForm = submitForm;
	}

	public void updateShowDialog() {
		
		if(!oldName.equals(name)) {
			setShowOtherDialog(true);
			setShowTypeDialog(false);
		} else if(!oldType.equals(type)) {
			setShowTypeDialog(true);
			setShowOtherDialog(false);
		} else {
			setShowTypeDialog(false);
			setShowOtherDialog(false);
			setSubmitForm(true);
		}
		System.out.println("*******ShowOtherDialog************** "+showOtherDialog);
		System.out.println("*******ShowTypeDialog************** "+showTypeDialog);
		System.out.println("*******SubmitForm************** "+submitForm);
	}
	
	

	public Boolean getShowTypeDialog() {
		return showTypeDialog;
	}

	public void setShowTypeDialog(Boolean showTypeDialog) {
		this.showTypeDialog = showTypeDialog;
	}

	public Boolean getShowOtherDialog() {
		return showOtherDialog;
	}

	public void setShowOtherDialog(Boolean showOtherDialog) {
		this.showOtherDialog = showOtherDialog;
	}



}
