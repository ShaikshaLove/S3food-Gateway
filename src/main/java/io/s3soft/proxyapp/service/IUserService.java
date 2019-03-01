package io.s3soft.proxyapp.service;

import io.s3soft.proxyapp.model.User;

public interface IUserService {
	public User getUserByEmail(String email);
}
