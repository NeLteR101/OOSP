public class DirectXGraphics extends Graphics{

    public DirectXGraphics(){
        this.api = new DirectXAPI();
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
