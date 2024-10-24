// Класс Main для демонстрации работы
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Изображение загружается при первом обращении
        image1.display(); 
        System.out.println();
        
        // Изображение уже загружено, повторное обращение не вызывает загрузку
        image1.display(); 
        System.out.println();
        
        // Загружается другое изображение
        image2.display(); 
    }
}