package ch.zhaw.iwi.adimed.service.interactionelement.list;

import ch.zhaw.iwi.adimed.model.interactionelement.list.TileListElement;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.interactionelement.list.TileListElementDatabaseService;

public class TileListElementDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<TileListElement, Long> {

	@Override
	protected Class<?> getService() {
		return TileListElementDatabaseService.class;
	}

	@Override
	protected Class<TileListElement> getEntity() {
		return TileListElement.class;
	}
	

}