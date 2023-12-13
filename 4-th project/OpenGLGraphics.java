public class OpenGLGraphics extends Graphics{
    public OpenGLGraphics(){
        this.api = new OpenGLAPI();
    }

    public void drawLine(){
        api.drawLine();
    }
    public void drawRectangle(){
        api.drawRectangle();
    }
    public void drawCircle(){
        api.drawCircle();
    }
}
