import java.util.ArrayList;




public class video {
    String title;
    boolean isCheckedout;
    int rating;

    video(String title, boolean isCheckedout, int rating) {
        this.isCheckedout = isCheckedout;
        this.rating = rating;
        this.title = title;
    }

    public void setTitle(String video) {
        this.title = video;
    }

    public void setCheckedout(boolean isCheckedout) {
        this.isCheckedout = isCheckedout;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getCheckedout() {
        return this.isCheckedout;
    }

    public int getRating() {
        return this.rating;
    }





}





