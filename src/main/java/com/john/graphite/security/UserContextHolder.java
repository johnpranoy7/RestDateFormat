package com.john.graphite.security;

public final class UserContextHolder {
	private static final ThreadLocal<UserContext> CONTEXT_HOLDER = new InheritableThreadLocal<>();

	public static void clearContext() {
		CONTEXT_HOLDER.remove();
	}

	public static UserContext getContext() {
		UserContext userContext = CONTEXT_HOLDER.get();
		return userContext;
	}

	public static void setContext(final UserContext userContext) {
		CONTEXT_HOLDER.set(userContext);
	}
}