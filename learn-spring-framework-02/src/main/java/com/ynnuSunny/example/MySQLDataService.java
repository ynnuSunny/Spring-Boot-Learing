package com.ynnuSunny.example;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] {11,22,55,33,44};
	}
     
}
