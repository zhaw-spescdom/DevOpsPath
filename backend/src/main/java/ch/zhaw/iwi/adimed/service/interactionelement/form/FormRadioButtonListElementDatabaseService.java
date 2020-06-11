package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class FormRadioButtonListElementDatabaseService extends AbstractCrudDatabaseService<FormRadioButtonListElement, Long> {

	@Override
	public Class<FormRadioButtonListElement> getEntityClass() {
		return FormRadioButtonListElement.class;
	}

	@Override
	public void createPathListEntry(FormRadioButtonListElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
	}

}