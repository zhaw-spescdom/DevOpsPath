package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormFileType;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class FormFileTypeDatabaseService extends AbstractCrudDatabaseService<FormFileType, Long> {

	@Override
	public Class<FormFileType> getEntityClass() {
		return FormFileType.class;
	}

	@Override
	public void createPathListEntry(FormFileType entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getFileType());
	}

}