package com.class28;

public class Room extends Building{

	int roomNumber;
	
	Room(String address, int floor, int roomNumber){
		super(address, floor);
		this.roomNumber = roomNumber;
		
	}
	
	public void print() {
		System.out.println("Building "  + address + " " + floor + " floor, room " + roomNumber);
	}
	
	public static void main(String[] args) {
		Room room = new Room("123 Madison Ave", 14, 1401);
		room.print();
	}
	
	
}
