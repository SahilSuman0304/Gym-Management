package memberPojo;

public class MemberFee 
{
   private int id;
   private String from,to,feePaid,date;
   
   
   
public MemberFee(int id, String from, String to, String feePaid, String date) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.feePaid = feePaid;
	this.date=date;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getFeePaid() {
	return feePaid;
}
public void setFeePaid(String feePaid) {
	this.feePaid = feePaid;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}
   
   
}
