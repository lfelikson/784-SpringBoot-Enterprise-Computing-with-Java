package com.example.myfirstapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhoneServiceImpl implements NotificationService {

    private final String msg;
    private final String dest;

	private final Notification ntf;
    
/* ++++++*/
	
    @Autowired
    public PhoneServiceImpl(Notification ntf) {
        this.msg  = /*msg*/  "Leonid";
        this.dest = /*dest*/ "Felikson";
    }

    @Override
    public String toString() {
        return String.format("Student: %s Faculty: %s", student, faculty);
    }

    @Override
	public void notify (ntf) {
		System.out.println("Phone call made to " + dest + " with Message="+msg);
	}

}
