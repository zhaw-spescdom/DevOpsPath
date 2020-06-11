package ch.zhaw.iwi.adimed.model.questionnaireresponse.value;

import javax.persistence.Entity;

@Entity
public class InteractionElementDoubleValue extends InteractionElementValue {
	
	private Double doubleValue;

	public Double getDoubleValue() {
		return doubleValue;
	}
	
	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}
		
	@Override
	public String getDisplayValue() {
		return String.valueOf(doubleValue);
	}
	
}
