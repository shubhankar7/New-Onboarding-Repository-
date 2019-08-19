package com.amdocs;

public class Main {

	public static void main(String[] args) {

		PaperWala paperwala=new PaperWala("Ananda Bazar");
		paperwala.addSubscriber(new Subscriber("babai"));
		paperwala.addSubscriber(new Subscriber("argha"));
		paperwala.addSubscriber(new Subscriber("ritesh"));
		
		paperwala.notifyAllSubscriber("Ei Somoi");
		
		
	}

}
