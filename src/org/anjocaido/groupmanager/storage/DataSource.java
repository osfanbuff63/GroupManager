/*
 * 
 */
package org.anjocaido.groupmanager.storage;

import java.io.IOException;

import org.anjocaido.groupmanager.dataholder.OverloadedWorldHolder;
import org.anjocaido.groupmanager.dataholder.WorldDataHolder;

/**
 * @author ElgarL
 *
 */
public interface DataSource {

	void init(String worldName);

	void loadWorld(String worldName, Boolean isMirror);
	void loadAllSearchedWorlds();

	void loadGroups(WorldDataHolder dataHolder) throws IOException;
	void loadUsers(WorldDataHolder dataHolder) throws IOException;

	void reload(WorldDataHolder dataHolder);
	void reloadGroups(WorldDataHolder dataHolder);
	void reloadUsers(WorldDataHolder dataHolder);

	void saveGroups(WorldDataHolder dataHolder);
	void saveUsers(WorldDataHolder dataHolder);

	void backup(OverloadedWorldHolder world, Boolean groupsOrUsers);
}
