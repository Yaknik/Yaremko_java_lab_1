class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Рисование квадрата. " + color.fill());
    }
}