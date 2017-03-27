package com.bs.tenement.utils;

import java.util.UUID;

public class IdUtils {

	/**
	 * 32娴ｅ秴鐡х粭锔胯 閻�? - 閸掑棗澹�? 24c4ddf4-8918-11e5-8877-adf959b0c13e
	 * 
	 * @return
	 */
	public static String uuid() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 32娴ｅ秴鐡х粭锔胯 24c4ddf4891811e58877adf959b0c13e
	 * 
	 * @return
	 */
	public static String id() {
		return uuid().replaceAll("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(id());
		System.out.println(id());
		System.out.println(id());
		System.out.println(id());
		System.out.println(id());
	}
	
}
