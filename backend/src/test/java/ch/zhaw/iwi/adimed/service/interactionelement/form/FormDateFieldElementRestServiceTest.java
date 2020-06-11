package ch.zhaw.iwi.adimed.service.interactionelement.form;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormDateFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.form.FormDateFieldElementRestService;

public class FormDateFieldElementRestServiceTest extends AbstractCrudRestServiceTest<FormDateFieldElement, Long> {
	
	@Override
	protected Class<?> getService() {
		return FormDateFieldElementRestService.class;
	}

	@Override
	protected Class<FormDateFieldElement> getEntityClass() {
		return FormDateFieldElement.class;
	}
	

}
