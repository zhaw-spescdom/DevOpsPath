package ch.zhaw.iwi.adimed.service.user.permission;

import ch.zhaw.iwi.adimed.model.user.permission.PermissionFunction;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseService;
import ch.zhaw.iwi.adimed.service.PathListEntry;

public class PermissionFunctionDatabaseService extends AbstractCrudDatabaseService<PermissionFunction, String> {

	@Override
	public Class<PermissionFunction> getEntityClass() {
		return PermissionFunction.class;
	}

	@Override
	public void createPathListEntry(PermissionFunction entity, PathListEntry<String> entry) {
		entry.setKey(entity.getKey(), getKeyName());
		entry.setName(entity.getName());
	}

}