package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonSelectionElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class ButtonSelectionElementDatabaseService extends AbstractCrudDatabaseService<ButtonSelectionElement, Long> {

	@Override
	public Class<ButtonSelectionElement> getEntityClass() {
		return ButtonSelectionElement.class;
	}

	@Override
	public void createPathListEntry(ButtonSelectionElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}