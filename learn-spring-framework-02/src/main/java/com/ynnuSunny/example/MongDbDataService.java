package com.ynnuSunny.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongDbDataService implements DataService{
     
	@Override
	public int[] retriveData() {
		return new int[] {3,4,5,3,35,7,9};
	}
}
