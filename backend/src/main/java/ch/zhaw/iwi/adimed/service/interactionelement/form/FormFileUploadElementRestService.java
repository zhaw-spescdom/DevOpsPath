package ch.zhaw.iwi.adimed.service.interactionelement.form;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.form.FormFileUploadElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class FormFileUploadElementRestService extends AbstractCrudRestService<FormFileUploadElement, Long, FormFileUploadElementDatabaseService> {

	@Inject
	public FormFileUploadElementRestService(Injector injector) {
		super(injector, FormFileUploadElementDatabaseService.class);
	}

}
