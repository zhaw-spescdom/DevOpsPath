package ch.zhaw.iwi.adimed.service.interactionelement.list;

import com.google.inject.Inject;
import com.google.inject.Injector;

import ch.zhaw.iwi.adimed.model.interactionelement.list.TileListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudRestService;

public class TileListElementRestService extends AbstractCrudRestService<TileListElement, Long, TileListElementDatabaseService> {

	@Inject
	public TileListElementRestService(Injector injector) {
		super(injector, TileListElementDatabaseService.class);
	}

}
