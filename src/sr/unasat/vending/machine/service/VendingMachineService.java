package sr.unasat.vending.machine.service;

public class VendingMachineService {

    public String fetchBeverage(String selection) {
        String message;
        switch (selection.toUpperCase()) {
            case "COLA":
                message = "Neem uw cola uit de bak. Bedankt voor uw SRD 8,00";
                break;
            case "SPRITE":
                message = "Neem uw sprite uit de bak. Bedankt voor uw SRD 8,00";
                break;
            default:
                message = "De door u gemaakte keuze komt niet voor";
        }
        return message;
    }
}
