package ch.zhaw.iwi.adimed.model.interactionelement.button;

import javax.persistence.Entity;

import ch.zhaw.iwi.adimed.model.interactionelement.InteractionElement;
import ch.zhaw.iwi.adimed.service.interactionelement.gui.BackButtonElementGuiModel;
import ch.zhaw.iwi.adimed.service.interactionstep.InteractionStepKey;

@Entity
public class BackButtonElement extends InteractionElement<BackButtonElementGuiModel> {

	@Override
	public String getAdministrationDisplayName() {
		return "Zurück-Button";
	}

	@Override
	public BackButtonElementGuiModel toGuiModel(BackButtonElementGuiModel guiModel, InteractionStepKey currentKey) {
		guiModel = new BackButtonElementGuiModel();
		guiModel.setType("backbutton");
		return super.toGuiModel(guiModel, currentKey);
	}

}
