package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonValue;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class FormRadioButtonValueDatabaseService extends AbstractCrudDatabaseService<FormRadioButtonValue, Long> {

	@Override
	public Class<FormRadioButtonValue> getEntityClass() {
		return FormRadioButtonValue.class;
	}

	@Override
	public void createPathListEntry(FormRadioButtonValue entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
	}

}