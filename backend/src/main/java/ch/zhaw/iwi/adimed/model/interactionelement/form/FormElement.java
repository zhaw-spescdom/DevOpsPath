package ch.zhaw.iwi.adimed.model.interactionelement.form;

import javax.persistence.Entity;

import ch.zhaw.iwi.adimed.model.interactionelement.InteractionElement;
import ch.zhaw.iwi.adimed.service.PathListEntry;
import ch.zhaw.iwi.adimed.service.interactionelement.gui.FormElementGuiModel;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepKey;

@Entity
public class FormElement extends InteractionElement<FormElementGuiModel> {

	@Override
	public FormElementGuiModel toGuiModel(FormElementGuiModel guiModel, InteractionStepKey currentKey) {
		guiModel = new FormElementGuiModel();
		guiModel.setType("inlineForm");
		guiModel.setForm("InteractionInlineForm");
		currentKey.setNextInteractionStepKey(getNextInteractionStep() != null ? getNextInteractionStep().getKey() : null);
		currentKey.setInteractionElementKey(getKey());
		currentKey.setInteractionElementDisplayValue(null);
		guiModel.setUrl("/interactionStep/" + currentKey.toEncodedKey() + "/form");
		guiModel.setPage("nextInteractionStepPage");
		PathListEntry<String> entry = new PathListEntry<String>();
		entry.setKey(currentKey.toEncodedKey(), InteractionStepKey.NAME);
		guiModel.setKey(entry.getKey());
		return super.toGuiModel(guiModel, currentKey);
	}

}
