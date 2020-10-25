package asgmt6;

import java.util.Scanner;

public class FindParticipantID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of participants");
        int numberOfParticipants = sc.nextInt();
        System.out.println("Enter the IDs");
        int[] participantIDs = new int[numberOfParticipants];
        for(i=0;i<numberOfParticipants;i++) {
        	participantIDs[i] = sc.nextInt();
        }
        int idToSearch;
        while(true) {
        	System.out.println("Enter ID to search");
            idToSearch = sc.nextInt();
            if(idToSearch==0) {
            	System.out.println("Program Terminated");
            	break;
            }
            for(i=0;i<numberOfParticipants;i++) {
            	if(idToSearch == participantIDs[i]) {
            		System.out.println("Participant with ID "+idToSearch+" exists");
            		break;
            	}
            }
            if(i == numberOfParticipants) {
            	System.out.println("Participant with ID "+idToSearch+" does not exist");
            }
            
        }
        sc.close();
	}

}
