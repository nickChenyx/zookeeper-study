package com.shaoqing.zookeeper1;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.KeeperException;

public class DeleteGroup extends ConnetctionWatcher {
	public void delete(String groupName) {
		String path = "/" + groupName;
		
		try {
			List<String> children = zk.getChildren(path, false);
			
			for(String child : children){
				zk.delete(path + "/" + child, -1);
			}
			zk.delete(path, -1);//版本号为-1，
		} catch (KeeperException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		DeleteGroup deleteGroup = new DeleteGroup();
		deleteGroup.connection("127.0.0.1:2181");
		deleteGroup.delete("test");
		deleteGroup.close();
	}
}
