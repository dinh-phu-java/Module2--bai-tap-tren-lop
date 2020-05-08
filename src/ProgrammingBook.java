public class ProgrammingBook  extends Book{
    private String language;
    private String frameWork;
    public ProgrammingBook(){

    }
    public ProgrammingBook(String name,double price,String author,String language,String frameWork){
        super(name,price,author);
        this.language=language;
        this.frameWork=frameWork;
    }

    public void setLanguage(String language){
        this.language=language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setFrameWork(String frameWork){
        this.frameWork=frameWork;
    }
    public String getFrameWork(){
        return this.frameWork;
    }

}
