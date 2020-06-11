package ch.zhaw.iwi.adimed.model.interactionelement.form;

import javax.persistence.Entity;

import ch.zhaw.iwi.adimed.service.interactionelement.gui.FormDateFieldElementGuiModel;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepKey;

@Entity
public class FormDateFieldElement extends FormValueFieldElement<FormDateFieldElementGuiModel> {

	@Override
	public FormDateFieldElementGuiModel toGuiModel(FormDateFieldElementGuiModel guiModel, InteractionStepKey currentKey) {
		guiModel = new FormDateFieldElementGuiModel();
		return super.toGuiModel(guiModel, currentKey);
	}
	
}
