package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonValue;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormRadioButtonValueDatabaseService;

public class FormRadioButtonValueDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<FormRadioButtonValue, Long> {

	@Override
	protected Class<?> getService() {
		return FormRadioButtonValueDatabaseService.class;
	}

	@Override
	protected Class<FormRadioButtonValue> getEntity() {
		return FormRadioButtonValue.class;
	}
	

}