package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormFileUploadElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class FormFileUploadElementDatabaseService extends AbstractCrudDatabaseService<FormFileUploadElement, Long> {

	@Override
	public Class<FormFileUploadElement> getEntityClass() {
		return FormFileUploadElement.class;
	}

	@Override
	public void createPathListEntry(FormFileUploadElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
	}

}