package bean.groovy

class GroovyMessenger implements Messenger {
	String message;
	
	GroovyMessenger() {}

    // this constructor is not available for Constructor Injection
    GroovyMessenger(String message) {
        this.message = message;
    }
}