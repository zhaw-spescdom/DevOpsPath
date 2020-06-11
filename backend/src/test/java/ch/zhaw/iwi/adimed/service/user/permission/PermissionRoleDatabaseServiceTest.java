package ch.zhaw.iwi.adimed.service.user.permission;

import ch.zhaw.iwi.adimed.model.user.permission.PermissionRole;
import ch.zhaw.iwi.adimed.service.AbstractCrudDatabaseServiceTest;
import ch.zhaw.iwi.adimed.service.user.permission.PermissionRoleDatabaseService;

public class PermissionRoleDatabaseServiceTest extends AbstractCrudDatabaseServiceTest<PermissionRole, Long> {
	
	@Override
	protected Class<?> getService() {
		return PermissionRoleDatabaseService.class;
	}

	@Override
	protected Class<PermissionRole> getEntity() {
		return PermissionRole.class;
	}	

}