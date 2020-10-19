//prints hello world in the 9 most spoken languages in the world
// in order: Chinese, Spanish, English, Arabic, Bengali, Portuguese, Russian, and Japanese
//credits to Google Translate
public class helloWorld {
    public static void main(String[] args) {
        String[] hello = { "你好，世界", "hola mundo", "hello world", "नमस्ते दुनिया", "مرحبا بالعالم", "ওহে বিশ্ব",
                "olá mundo", "Привет мир", "こんにちは世界" };
        for (String str : hello)
            System.out.println(str);
    }
}