package util;

public enum SectionType {

    VIP_MG("VIP+M&G"),
    VIP_RIGHT("VIP"),
    VIP_LEFT("VIP"),
    VIP_CENTER("VIP"),
    PLATEA_A_RIGHT("PLATEA A RIGHT"),
    PLATEA_A_LEFT("PLATEA A  LEFT"),
    PLATEA_A_CENTER("PLATEA A CENTER"),
    PLATEA_B_CENTER("PLATEA B CENTER"),
    PLATEA_B_RIGHT("PLATEA B RIGHT"),
    PLATEA_B_LEFT("PLATEA B LEFT");

    private String displayName;

    SectionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
