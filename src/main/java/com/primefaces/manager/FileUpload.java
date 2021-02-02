package com.primefaces.manager;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;   
@Named 
public class FileUpload {  
	private UploadedFile file;
	public void handleFileUpload(FileUploadEvent event) {  
		FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");  
		FacesContext.getCurrentInstance().addMessage(null, message);  
	} 
	
	
	public void preProcessMassive(FileUploadEvent event) {
		RequestContext context = RequestContext.getCurrentInstance();
		String script =  "confirmMassiveCancel('Do you want to process  line(s)?', postProcessMassiveCancel)";
		context.execute(script);
	}
	public void preProcessMassive() {
		System.out.println("preProcessMassive "+file.getFileName()+" preProcessMassive");
		RequestContext context = RequestContext.getCurrentInstance();
		String script =  "confirmMassiveCancel('Do you want to process  line(s)?', postProcessMassiveCancel)";
		context.execute(script);
	}
	
	public void postProcessMassive() {
		System.out.println("%%%%%%%%%%%  %%%%%%%%%%");
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}
	
	
}  
