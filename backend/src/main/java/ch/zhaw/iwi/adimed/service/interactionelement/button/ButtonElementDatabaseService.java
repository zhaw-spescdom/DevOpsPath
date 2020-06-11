package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.ButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class ButtonElementDatabaseService extends AbstractCrudDatabaseService<ButtonElement, Long> {

	@Override
	public Class<ButtonElement> getEntityClass() {
		return ButtonElement.class;
	}

	@Override
	public void createPathListEntry(ButtonElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}