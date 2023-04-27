package ch3.trump;

public enum Shape {
    SPADE("스페이드"),
    CLOVER("클로버") ,
    HEART("하트"),
    DIAMOND("다이아몬드"),
    TRUMP_HUMAN("트럼프 인간");

    private final String nowShape;

    Shape(String nowShape) {
        this.nowShape = nowShape;
    }
}
