package Ticketsystem;

public class Ticket {
	private String TicketNumber;
	private String CreatedBy;
	private String AssignTo;
	private String TicketDesc;
	private int TicketType;
	private int Status;
	private String comments;
	
	public Ticket createTicket() {
		Ticket t = new Ticket();
	return t;
	}
	
	public void updateComments(String comments) {
		this.comments=this.comments+"  "+comments; 
		
	}
	
	public void PrintTicket() {
		System.out.println("TicketNumer"+TicketNumber);
	}
	
	public String getTicketNumber() {
		return TicketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		TicketNumber = ticketNumber;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getAssignTo() {
		return AssignTo;
	}
	public void setAssignTo(String assignTo) {
		AssignTo = assignTo;
	}
	public String getTicketDesc() {
		return TicketDesc;
	}
	public void setTicketDesc(String ticketDesc) {
		TicketDesc = ticketDesc;
	}
	public int getTicketType() {
		return TicketType;
	}
	public void setTicketType(int ticketType) {
		TicketType = ticketType;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getComment() {
		return comments;
	}
	public void setComment(String comment) {
		comments = comment;
	}
	

}
