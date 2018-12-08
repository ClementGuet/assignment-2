package ee402;

import java.io.Serializable;
import java.util.Calendar;

public class Temperature implements Serializable{
private int temperature;
private Calendar calendar;
private int time;
private String PortName;

public Temperature(int temperature, Calendar calendar,int time, String PortName) {
	this.temperature = temperature;
	this.calendar = calendar;
	this.time = time;
	this.PortName = PortName;
}

public int getTemperature() {
	return temperature;
}

public Calendar getCalendar() {
	return calendar;
}

public int gettime() {
	return time;
}

public String getPortName() {
	return PortName;
}

public String toString() {
	return "Temperature :" + temperature+ " Date : "+calendar.getTime().toString()+ "Time : "+time+" Name : "+PortName;
}

}

