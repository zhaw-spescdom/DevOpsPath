package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormNumberFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormNumberFieldElementDatabaseService;

public class FormNumberFieldElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<FormNumberFieldElement, Long> {

	@Override
	protected Class<?> getService() {
		return FormNumberFieldElementDatabaseService.class;
	}

	@Override
	protected Class<FormNumberFieldElement> getEntity() {
		return FormNumberFieldElement.class;
	}
	

}