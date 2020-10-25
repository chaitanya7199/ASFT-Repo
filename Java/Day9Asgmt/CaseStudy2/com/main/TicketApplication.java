package com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.model.Ticket;
import com.model.Train;

public class TicketApplication {

	public static void main(String[] args) {
		Train train1 = new Train(1003, "VIVEK EXP", "Bangalore", "Mumbai", 750);
		Train train2 = new Train(1004, "SUPER AC EXP", "Chennai", "Kerela", 950);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Train Number");
		int trainNo = sc.nextInt();
		ArrayList<Integer> trainNumbers = new ArrayList<Integer>();
		trainNumbers.add(train1.getTrainNo());
		trainNumbers.add(train2.getTrainNo());
		if(!trainNumbers.contains(trainNo)) {
			System.out.println("Train with given train number does not exist");
			return;
		}
		System.out.println("Enter Travel Date");
		String tDate = sc.next();
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(tDate);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int year = c.get(Calendar.YEAR);
			int month = 1 + c.get(Calendar.MONTH);
			int day =  c.get(Calendar.DAY_OF_MONTH);
			LocalDate currentDate = LocalDate.now();
			LocalDate travelDate = LocalDate.of(year, month, day);
			Period period = currentDate.until(travelDate);
			int days = period.getDays();
			if(days <= 0 ) {
				System.out.println("Travel Date is before current date");
				return;
			}
		} catch (ParseException e) {
			e.getMessage();
		}
		System.out.println("Enter Number of Passengers");
		int noOfPassengers = sc.nextInt();
		Ticket t = new Ticket(date, train1);
		while(noOfPassengers > 0) {
			sc.nextLine();
			System.out.println("Enter Passenger Name");
			String pName = sc.nextLine();
			System.out.println("Enter Age");
			int pAge = sc.nextInt();
			System.out.println("Enter Gender(M/F)");
			char pGender = sc.next().charAt(0);
			t.addPassenger(pName, pAge, pGender);
			--noOfPassengers;
		}
		t.writeTicket();
		sc.close();
	}

}
