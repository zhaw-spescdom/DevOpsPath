package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormTextFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormTextFieldElementRestService;

public class FormTextFieldElementRestServiceTest extends AbstractCrudRestServiceTest<FormTextFieldElement, Long> {
	
	@Override
	protected Class<?> getService() {
		return FormTextFieldElementRestService.class;
	}

	@Override
	protected Class<FormTextFieldElement> getEntityClass() {
		return FormTextFieldElement.class;
	}
	

}
