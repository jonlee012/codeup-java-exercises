package movies;

public class Movie {
    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }



}
