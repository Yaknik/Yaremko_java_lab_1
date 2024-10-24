// Прокси-объект
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        // Ленивая инициализация: создаем реальный объект только при необходимости
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}