class ComputerFacadeTestDrive {
    public static void main(String[] args) {
        /* Your subsystems */

        ComputerFacade computerFacade = new ComputerFacade(new Processor(), new Monitor(), new Keyboard());/* Write your code here */

        computerFacade.turnOnComputer();
        computerFacade.turnOffComputer();
    }
}

class ComputerFacade {
    private final Processor processor;
    private final Monitor monitor;
    private final Keyboard keyboard;
    /* Your subsystems */

    public ComputerFacade(Processor processor, Monitor monitor, Keyboard keyboard) {
        /* Write your code here */
        this.processor = processor;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public void turnOnComputer() {
        processor.on();
        monitor.on();
        keyboard.on();
    }

    public void turnOffComputer() {
        keyboard.off();
        monitor.off();
        processor.off();
    }
}

class Processor {
    /* Your subsystem description */
    private final String description = "Processor";

    public void on() {
       System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}

class Monitor {
    private final String description = "Monitor";

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }
}

class Keyboard {
    private final String description = "Keyboard";

    public void on() {
        System.out.println(description + " on");
        turnOnBacklight();
    }

    public void off() {
        System.out.println(description + " off");
        turnOffBacklight();
    }

    private void turnOnBacklight() {
        System.out.println("Backlight is turned" + " on");
    }

    private void turnOffBacklight() {
        System.out.println("Backlight is turned" + " off");
    }
}