package social;

import java.util.*;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;



public class MySocial implements SocialNetwork{
	


	Collection <Friend> myFriendList = new HashSet<Friend>();

	
	@Override
	public void addFriend(Friend f) {
		// TODO Auto-generated method stub
		if (f.equals(null)) {
			throw new NullPointerException();
		}
		
		/*if ( f == null){
			throw new IllegalArgumentException();
			}*/
		myFriendList.add(f);
	}

	@Override
	public Collection<Friend> findByCity(String city) {
		
		
		List<Friend> listByCity= new ArrayList<>();
		
		for (Friend list :myFriendList)	{
			if (list.getCity().equals(city)) {
				
				listByCity.add(list);
			}
		}

		// Colleccija
		
		return listByCity;
	}

	@Override
	public Friend findFriend(String firstname, String lastname) throws FriendNotFoundException {
		
		if (firstname==null||lastname==null)
		{
			throw new IllegalArgumentException();
		}
		for (Friend flist: myFriendList) {
			if (flist.getFirstName().equals(firstname)&&flist.getLastName().equals(lastname)) {
				return flist;
			}
		}
		throw new Exception(firstname, lastname);
		
		// vieneta
		
	}

	@Override
	public int getNumberOfFriends() {
		// TODO Auto-generated method stub
		return myFriendList.size();
	}

	@Override
	public Collection<Friend> getOrderedFriends() {
		// idedam i list ir darom sort
		
		List<Friend> newlist= new ArrayList<Friend>();
		
		for (Friend l:myFriendList) {
			newlist.add(l);
			
		/*	Collections.sort (newlist, new Comparator<Friend>(){

				@Override
				public int compare(Friend p1, Friend p2) {
					// TODO Auto-generated method stub
					
					return p1.getFirstName().compareTo(p2.getFirstName());
				}
				
				
					
				});*/

			Collections.sort(newlist, new Comparator<Friend>() {

				@Override
				public int compare(Friend p1, Friend p2) {
					// TODO Auto-generated method stub
				return p1.getFirstName().compareTo(p2.getFirstName());
				}
				
				
			});
			
		}
		
			
		
		return newlist;
	}

}
