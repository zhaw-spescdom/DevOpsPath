package ch.zhaw.iwi.devops.model.interactionelement.form;

import javax.persistence.Entity;

import ch.zhaw.iwi.devops.service.interactionelement.gui.FormDateFieldElementGuiModel;
import ch.zhaw.iwi.devops.service.interactionstep.InteractionStepKey;

@Entity
public class FormDateFieldElement extends FormValueFieldElement<FormDateFieldElementGuiModel> {

	@Override
	public FormDateFieldElementGuiModel toGuiModel(FormDateFieldElementGuiModel guiModel, InteractionStepKey currentKey) {

		return super.toGuiModel(guiModel, currentKey);
	}
	
}
