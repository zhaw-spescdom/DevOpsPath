package ch.zhaw.iwi.adimed.service.interactionelement.button;

import ch.zhaw.iwi.adimed.model.interactionelement.button.BackButtonElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class BackButtonElementDatabaseService extends AbstractCrudDatabaseService<BackButtonElement, Long> {

	@Override
	public Class<BackButtonElement> getEntityClass() {
		return BackButtonElement.class;
	}

	@Override
	public void createPathListEntry(BackButtonElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}