package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormRadioButtonListElementRestService;

public class FormRadioButtonListElementRestServiceTest extends AbstractCrudRestServiceTest<FormRadioButtonListElement, Long> {
	
	@Override
	protected Class<?> getService() {
		return FormRadioButtonListElementRestService.class;
	}

	@Override
	protected Class<FormRadioButtonListElement> getEntityClass() {
		return FormRadioButtonListElement.class;
	}
	

}
