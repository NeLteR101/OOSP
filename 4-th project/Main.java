public class Main {
    public static void main(String[] args) {
        Graphics directGraphics = new DirectXGraphics();
        Graphics openglGraphics = new OpenGLGraphics();
        Graphics metalGraphics = new MetalGraphics();

        directGraphics.drawLine();
        directGraphics.drawRectangle();
        directGraphics.drawCircle();

        openglGraphics.drawLine();
        openglGraphics.drawRectangle();
        openglGraphics.drawCircle();

        metalGraphics.drawLine();
        metalGraphics.drawRectangle();
        metalGraphics.drawCircle();
    }
}