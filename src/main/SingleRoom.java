package main;

import java.util.ArrayList;

public class SingleRoom  {
	String name;
	String contact;
	String gender;
	ArrayList<Food> food = new ArrayList<>();

	SingleRoom() {
		this.name = "";
	}

	SingleRoom(String name, String contact, String gender) {
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}
}
