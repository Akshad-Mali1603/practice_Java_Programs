package main;

import info.ManagerInfo;
import sub_class.Manager;

public class TestManager {
	public static void main(String[] args) {

		ManagerInfo info = new ManagerInfo();

		Manager arr[] = info.create();
		info.display(arr);

	}

}
