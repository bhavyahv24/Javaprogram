package com.core.learn;

import java.util.*;
import java.math.*;

public class FindPerfectSquare{
	public static int solve(int A) {

		int sqrt=(int)(Math.sqrt(((double)A)));
		if((sqrt*sqrt)==A)
			return 1;
		else
			return 0;
	}
}