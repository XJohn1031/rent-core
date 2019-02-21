package cn.bupt.john.provider.remoteImpl;

import cn.bupt.john.remote.TestRemote;

import org.springframework.stereotype.Service;


/**
 *
 * @author xjohn
 * @since 20 February 2019
 */
@Service
public class TestRemoteImpl implements TestRemote {

	@Override
	public String testRemoteMethod(String request) {
		return "success";
	}

}
