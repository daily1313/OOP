package ch2;

public enum Location {
    동굴("동굴"),
    정원("정원");

    private final String nowLocation;

    Location(String nowLocation) {
        this.nowLocation = nowLocation;
    }
}
