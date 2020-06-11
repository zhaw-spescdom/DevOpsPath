package ch.zhaw.iwi.adimed.service.interactionelement.form;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormDateFieldElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class FormDateFieldElementRestService extends AbstractCrudRestService<FormDateFieldElement, Long, FormDateFieldElementDatabaseService> {

	@Inject
	public FormDateFieldElementRestService(Injector injector) {
		super(injector, FormDateFieldElementDatabaseService.class);
	}

}
