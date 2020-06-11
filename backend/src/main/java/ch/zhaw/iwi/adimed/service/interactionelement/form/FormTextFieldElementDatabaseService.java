package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormTextFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class FormTextFieldElementDatabaseService extends AbstractCrudDatabaseService<FormTextFieldElement, Long> {

	@Override
	public Class<FormTextFieldElement> getEntityClass() {
		return FormTextFieldElement.class;
	}

	@Override
	public void createPathListEntry(FormTextFieldElement entity, PathListEntry<Long> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
	}

}