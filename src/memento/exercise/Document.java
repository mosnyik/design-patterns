package memento.exercise;


public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    public DocState createState(){
        return  new DocState( content,
                fontName, fontSize);
    }
    public void restore(DocState doc){
         fontName =doc.getFontName();
         content = doc.getContent();
         fontSize = doc.getFontSize();

    }
}