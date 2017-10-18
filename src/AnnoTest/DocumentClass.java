package AnnoTest;

@AnnHtmlUL(border = "1sgdfgpx solid red")
public class DocumentClass {

	
    private String author;

    public String getDocumentName() {
        return "Java Core";
    }

    @AnnHtmlLI(background = "yellow")
    public String getDocumentVersion() {
        return "1.0";
    }

    @AnnHtmlLI(background = "green")
    public void setAuthor(String author) {
        this.author = author;
    }

    @AnnHtmlLI(background = "red", color = "black")
    public String getAuthor() {
        return author;
    }
    
    // This method is not annotated
    public float getPrice()  {
        return 100;
    }

}