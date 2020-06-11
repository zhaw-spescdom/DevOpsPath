package ch.zhaw.iwi.adimed.service.interactionelement.gui;

public class FormTextFieldElementGuiModel extends FormValueFieldElementGuiModel {

	private int height = 1;

	public FormTextFieldElementGuiModel() {
		super();
		this.setType("text");
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
