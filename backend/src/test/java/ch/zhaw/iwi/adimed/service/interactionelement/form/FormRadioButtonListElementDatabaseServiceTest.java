package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormRadioButtonListElementDatabaseService;

public class FormRadioButtonListElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<FormRadioButtonListElement, Long> {

	@Override
	protected Class<?> getService() {
		return FormRadioButtonListElementDatabaseService.class;
	}

	@Override
	protected Class<FormRadioButtonListElement> getEntity() {
		return FormRadioButtonListElement.class;
	}
	

}