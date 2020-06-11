package ch.zhaw.iwi.adimed.service.interactionelement.list;

import ch.zhaw.iwi.adimed.model.interactionelement.list.ButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class ButtonListElementDatabaseService extends AbstractCrudDatabaseService<ButtonListElement, Long> {

	@Override
	public Class<ButtonListElement> getEntityClass() {
		return ButtonListElement.class;
	}

	@Override
	public void createPathListEntry(ButtonListElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}