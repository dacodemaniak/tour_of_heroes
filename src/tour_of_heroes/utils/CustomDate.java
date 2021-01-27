package tour_of_heroes.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDate {
	private Date date;
	
	private String inputFormat;
	private String outputFormat;
	
	private SimpleDateFormat inputSdf;
	private SimpleDateFormat outputSdf;
	
	public CustomDate() {
		this.inputFormat = this.outputFormat = "dd-MM-yyyy";
		this.setSimpleDateFormat();
	}
	
	public CustomDate(String inputFormat, String outputFormat) {
		this.inputFormat = inputFormat;
		this.outputFormat = outputFormat;
		
		this.setSimpleDateFormat();
	}
	
	public CustomDate(String inputFormat) {
		this.inputFormat = this.outputFormat = inputFormat;
		
		this.setSimpleDateFormat();
	}
	
	public void setDate(String date) {
		try {
			this.date = this.inputSdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public String asString() {
		return this.outputSdf.format(this.date);
	}
	
	private void setSimpleDateFormat() {
		this.date = new Date();
		
		this.inputSdf = new SimpleDateFormat(this.inputFormat);
		this.outputSdf = new SimpleDateFormat(this.outputFormat);
	}
}
