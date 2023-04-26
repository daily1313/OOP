package ch3.trump;

public enum Shape {
    SPADE("스페이드"),
    CLOVER("클로버"),
    HEART("하트"),
    DIAMOND("다이아몬드"),
    CROWN("왕관"),
    TRUMP_HUMAN("트럼프 인간"),
    TRUMP("트럼프");

    private final String nowShape;

    Shape(String nowShape) {
        this.nowShape = nowShape;
    }
}
