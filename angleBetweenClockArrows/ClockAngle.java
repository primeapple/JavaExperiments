import java.math.*;
public class ClockAngle {
	private Integer minute;
	private Integer hour;

	public ClockAngle(Integer hour, Integer minute){
		if ((0 <= hour && hour <= 11) && (0 <= minute && minute <= 59)){
			this.hour = hour;
			this.minute = minute;
		} else {
			System.out.println("Hour must be between 0 and 11 and Minute must be between 0 and 59");
		}
	}

	public Double calculateAngle(){
		Double minuteAngleFromZero = this.minute * 6.0;
		Double hourAngleFromZero = this.hour * 30.0 + this.minute / 2.0;
		return Math.abs(minuteAngleFromZero - hourAngleFromZero);
	}
}
