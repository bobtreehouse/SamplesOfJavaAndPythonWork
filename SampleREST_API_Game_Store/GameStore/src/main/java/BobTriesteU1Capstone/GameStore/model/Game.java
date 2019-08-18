package BobTriesteU1Capstone.GameStore.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Game {


    private int gameId;
    private String title;
    private String esrb_rating;
    private String description;
    private BigDecimal price;
    private String studio;
    private int quantity;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsrb_rating() {
        return esrb_rating;
    }

    public void setEsrb_rating(String esrb_rating) {
        this.esrb_rating = esrb_rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game that = (Game) o;
        return gameId == that.gameId &&
                title == that.title &&
                esrb_rating == that.esrb_rating &&
                description == that.description &&
                price.equals(that.price) &&
                studio.equals(that.studio) &&
                quantity==(that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, title, esrb_rating, description, price, studio, quantity);
    }
}
