public class videoLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("The Matrix", false, 0);
        videoStore.addVideo("Godfather II", false, 0);
        videoStore.addVideo("Star Wars Episode IV: A New Hope", false, 0);
        videoStore.checkout("The Matrix");
        videoStore.receiveRating("The Matrix", 4);
        videoStore.checkout("Godfather II");
        videoStore.receiveRating("Godfather II", 3);
        videoStore.checkout("Star Wars Episode IV: A New Hope");
        videoStore.receiveRating("Star Wars Episode IV: A New Hope", 5);
        videoStore.checkout("The Matrix");
        videoStore.ListInventory();
    }
}
