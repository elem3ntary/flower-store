package flowerstore;

public enum Color {
    WHITE(new int[]{120,30, 40});

    private int[] rgb;
    private Color(int[] rgb) {
        this.rgb = rgb;
    }
}
