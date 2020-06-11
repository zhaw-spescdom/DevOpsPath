package ch.zhaw.iwi.adimed.service.interactionelement.form;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormTextFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class FormTextFieldElementRestService extends AbstractCrudRestService<FormTextFieldElement, Long, FormTextFieldElementDatabaseService> {

	@Inject
	public FormTextFieldElementRestService(Injector injector) {
		super(injector, FormTextFieldElementDatabaseService.class);
	}

}
