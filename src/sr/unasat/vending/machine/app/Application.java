package sr.unasat.vending.machine.app;

import sr.unasat.vending.machine.service.VendingMachineService;

public class Application {
    public static void main(String[] args) {
        VendingMachineService vs = new VendingMachineService();
        System.out.println(vs.fetchBeverage("sprITe"));
    }
}
