import java.util.ArrayList;

class VideoStore {
    ArrayList<video> list = new ArrayList<>();

    public void addVideo(String title, boolean isCheckedout, int rating) {
        video Video = new video(title, isCheckedout, rating);
        list.add(Video);
    }

    public boolean checkout(String videoTitle) {
        for (video Video : list) {
            if (Video.getTitle().equals(videoTitle) && !Video.getCheckedout()) {
                Video.setCheckedout(true);
                return true;
            }
        }
        return false;
    }

    public video receiveRating(String videoTitle, int rating) {
        for (video Video : list) {
            if (Video.getTitle().equals(videoTitle)) {
                Video.setRating(rating);
                return Video;
            }
        }
        return null;
    }

    public void ListInventory() {
        for (video Video : list) {
            System.out.println("Title: " + Video.getTitle() + ", Checked Out: " + Video.getCheckedout() + ", Rating: " + Video.getRating());
        }
    }

}