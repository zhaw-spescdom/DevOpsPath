package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormTextFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormTextFieldElementDatabaseService;

public class FormTextFieldElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<FormTextFieldElement, Long> {

	@Override
	protected Class<?> getService() {
		return FormTextFieldElementDatabaseService.class;
	}

	@Override
	protected Class<FormTextFieldElement> getEntity() {
		return FormTextFieldElement.class;
	}
	

}