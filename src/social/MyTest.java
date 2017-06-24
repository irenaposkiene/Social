package social;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.BaseSocialNetworkTest;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MyTest extends BaseSocialNetworkTest   {

	@Override
	protected SocialNetwork getSocialNetwork() {
		// TODO Auto-generated method stub
		return new MySocial();
	}

}
