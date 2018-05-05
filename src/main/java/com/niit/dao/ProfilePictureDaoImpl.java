package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.ProfilePicture;

public class ProfilePictureDaoImpl implements ProfilePictureDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	public void upload(ProfilePicture profilePicture) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture);
		
	}

	public ProfilePicture getProfilePic(String email) {
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture profilePicture=(ProfilePicture)session.get(ProfilePicture.class, email);
		System.out.println("DAO " + email + " " + profilePicture);
		return profilePicture;
	}

}