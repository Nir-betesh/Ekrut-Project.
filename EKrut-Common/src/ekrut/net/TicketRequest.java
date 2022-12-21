package ekrut.net;

import java.io.Serializable;

import ekrut.entity.TicketStatus;

public class TicketRequest implements Serializable{
	
	private static final long serialVersionUID = 7134346281040324590L;
	private TicketRequestType action;
	private int ticketId;
	private TicketStatus status;
	private String ekrutLocation;
	
	
	
	public TicketRequest(TicketRequestType action, int ticketId) {
		this.action = action;
		this.ticketId = ticketId;
	}

	public TicketRequest(TicketRequestType action) {
		this.action = action;
	}

	public TicketRequestType getAction() {
		return action;
	}

	public int getTicketId() {
		return ticketId;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public String getEkrutLocation() {
		return ekrutLocation;
	}

	
	
}
