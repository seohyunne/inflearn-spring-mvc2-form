package hello.itemservice.domain.item;


public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETD("기타");

    private final String description;

    ItemType(String description){
        this.description = description;
    }

}
