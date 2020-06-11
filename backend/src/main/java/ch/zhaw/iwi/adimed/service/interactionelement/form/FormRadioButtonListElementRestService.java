package ch.zhaw.iwi.adimed.service.interactionelement.form;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormRadioButtonListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class FormRadioButtonListElementRestService extends AbstractCrudRestService<FormRadioButtonListElement, Long, FormRadioButtonListElementDatabaseService> {

	@Inject
	public FormRadioButtonListElementRestService(Injector injector) {
		super(injector, FormRadioButtonListElementDatabaseService.class);
	}

}
