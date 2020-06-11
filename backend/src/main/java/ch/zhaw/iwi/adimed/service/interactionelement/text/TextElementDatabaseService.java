package ch.zhaw.iwi.adimed.service.interactionelement.text;

import ch.zhaw.iwi.adimed.model.interactionelement.text.TextElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class TextElementDatabaseService extends AbstractCrudDatabaseService<TextElement, Long> {

	@Override
	public Class<TextElement> getEntityClass() {
		return TextElement.class;
	}

	@Override
	public void createPathListEntry(TextElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getAdministrationDisplayName());
	}

}