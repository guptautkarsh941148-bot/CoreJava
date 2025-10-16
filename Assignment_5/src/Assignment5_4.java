
	enum TrafficLight {
	    RED(30),
	    GREEN(45),
	    YELLOW(5);

	    private int duration; 
	    TrafficLight(int duration) {
	        this.duration = duration;
	    }
 
	    public int getDuration() {
	        return duration;
	    }
	}

	public  class Assignment5_4 {
	    public static void main(String[] args) {
	        System.out.println("Traffic Light Durations:");
	        for (TrafficLight light : TrafficLight.values()) {
	            System.out.println(light + " light stays for " + light.getDuration() + " seconds.");
	        }
	    }
	}
