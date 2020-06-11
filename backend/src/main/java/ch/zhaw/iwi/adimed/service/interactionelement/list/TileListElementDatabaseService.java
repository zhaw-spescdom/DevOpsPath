package ch.zhaw.iwi.adimed.service.interactionelement.list;

import ch.zhaw.iwi.adimed.model.interactionelement.list.TileListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class TileListElementDatabaseService extends AbstractCrudDatabaseService<TileListElement, Long> {

	@Override
	public Class<TileListElement> getEntityClass() {
		return TileListElement.class;
	}

	@Override
	public void createPathListEntry(TileListElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}