package ch.zhaw.iwi.adimed.model.interactionelement.form;

import javax.persistence.Entity;

import ch.zhaw.iwi.adimed.service.interactionelement.gui.FormTextFieldElementGuiModel;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepKey;

@Entity
public class FormTextFieldElement extends FormValueFieldElement<FormTextFieldElementGuiModel> {

	private int height = 1;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public FormTextFieldElementGuiModel toGuiModel(FormTextFieldElementGuiModel guiModel, InteractionStepKey currentKey) {
		guiModel = new FormTextFieldElementGuiModel();
		guiModel.setName(getName());
		guiModel.setHeight(height);
		return super.toGuiModel(guiModel, currentKey);
	}
	
}
