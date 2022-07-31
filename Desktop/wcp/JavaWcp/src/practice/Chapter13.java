package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
	public static void main(String[] args) {
		MobiePhone mobilePhone = new MobilePhone("000-1111-2222");
		mobilePhone.takePicture();
		Chapter13.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
	}

	public static void staticCall(Phone phone, Strig number) {
		phone.call(number);
	}

}
