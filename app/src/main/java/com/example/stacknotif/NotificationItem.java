package com.example.stacknotif;

// Class ini berguna sebagai holder untuk notification
public class NotificationItem {
	private int id;
	private String sender;
	private String message;
	
	// Constructor untuk membangun object yg bertipe class NotificationItem
	NotificationItem(int id, String sender, String message){
		this.id = id;
		this.sender = sender;
		this.message = message;
	}
	
	// Getter dan setter dari variable di class
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
